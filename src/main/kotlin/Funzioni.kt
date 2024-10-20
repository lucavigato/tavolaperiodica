import kotlin.math.log10
import kotlin.math.round

fun parseNumber(number: String): Double {
    return number.replace(",", ".").toDoubleOrNull() ?: 0.0
}

fun resultMoli(grammi: Double?, moli: Double?, massaMolare: Double?, selection: String): Double {
    val temp = when (selection) {
        "Grammi"    -> String.format("%.3f", (massaMolare ?: 0.0) * (moli ?: 0.0))
        "Moli"      -> String.format("%.3f", (grammi ?: 0.0) / (massaMolare ?: 1.0))
        else        -> String.format("%.3f", (grammi ?: 0.0) / (moli ?: 1.0))

    }

    return parseNumber(temp)
}

fun resultMolality(kili: Double?, moli: Double?, molal: Double?, selection: String): Double {
    val temp = when (selection) {
        "Molalità"  -> String.format("%.3f", (moli ?: 0.0) / (kili ?: 1.0))
        "Kili"      -> String.format("%.3f", (moli ?: 0.0) / (molal ?: 1.0))
        else        -> String.format("%.3f", (molal ?: 0.0) * (kili ?: 0.0))
    }

    return parseNumber(temp)
}

fun resultMolarity(litri: Double?, moli: Double?, molar: Double?, selection: String): Double {
    val temp = when (selection) {
        "Molarità"  -> String.format("%.3f", (moli ?: 0.0) / (litri ?: 1.0))
        "Litri"     -> String.format("%.3f", (moli ?: 0.0) / (molar ?: 1.0))
        else        -> String.format("%.3f", (molar ?: 0.0) * (litri ?: 0.0))
    }

    return parseNumber(temp)
}

fun resultMassa(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    result *= when (from) {
        "oz"    ->  28.3495
        "lb"    ->  453.592
        "kg"    ->  1000.0
        else    ->  1.0
    }

    result /= when (to) {
        "oz"    ->  28.3495
        "lb"    ->  453.592
        "kg"    ->  1000.0
        else    ->  1.0
    }

    return parseNumber(String.format("%.3f", result))
}


fun resultLength(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    result *= when (from) {
        "in"    ->  0.0254
        "ft"    ->  0.3048
        "yd"    ->  0.9144
        "km"    ->  1000.0
        "mi"    ->  1609.344
        "nmi"   ->  1852.0
        else    ->  1.0
    }

    result /= when (to) {
        "in"    ->  0.0254
        "ft"    ->  0.3048
        "yd"    ->  0.9144
        "km"    ->  1000.0
        "mi"    ->  1609.344
        "nmi"   ->  1852.0
        else    ->  1.0
    }
    return parseNumber(String.format("%.3f", result))
}


fun resultPress(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    result *= when (from) {
        "bar"   ->  0.986923
        "kPa"   ->  0.00986923
        "torr"  ->  0.000131579
        else    ->  1.0
    }

    result /= when (to) {
        "bar"   ->  0.986923
        "kPa"   ->  0.00986923
        "torr"  ->  0.000131579
        else    ->  1.0
    }
    return parseNumber(String.format("%.3f", result))
}


fun resultTemp(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    // first convert to C
    result = when (from) {
        "Kelvin"        ->  result - 273.15
        "Fahrenheit"    ->  (result - 32) * 5/9
        "Rankine"       ->  (result - 491.67) * 5/9
        else            ->  value ?: 0.0
    }

    // then convert to the other unit
    result = when (to) {
        "Kelvin"        ->  result + 273.15
        "Fahrenheit"    ->  (result * 9/5) + 32
        "Rankine"       ->  (result * 9/5) + 491.67
        else            ->  result
    }
    return parseNumber(String.format("%.3f", result))
}


fun resultVol(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    result *= when (from) {
        "oz" ->  1 / 33.814
        "gal"   ->  33.814
        "mL"    ->  0.001
        "m3"    ->  1000.0
        "ft3"   ->  28.317
        else    ->  1.0
    }

    result /= when (to) {
        "oz" ->  1 / 33.814
        "gal"   ->  33.814
        "mL"    ->  0.001
        "m3"    ->  1000.0
        "ft3"   ->  28.317
        else    ->  1.0
    }
    return parseNumber(String.format("%.3f", result))
}


fun resultEnergy(from: String, to: String, value: Double?): Double {
    var result: Double = value ?: 0.0

    result *= when (from) {
        "j"     ->  0.239006
        "kcal"  ->  1000.0
        "Wh"    ->  860.421
        else    ->  1.0
    }

    result /= when (to) {
        "j"     ->  0.239006
        "kcal"  ->  1000.0
        "Wh"    ->  860.421
        else    ->  1.0
    }
    return parseNumber(String.format("%.3f", result))
}


fun resultInnalzamento(moli: Double?, vanthoff: Double?, const: Double?, delta: Double?, selection: String): Double {
    val temp = when (selection) {
        "M"     ->  String.format("%.3f", (delta ?: 0.0) / ((vanthoff ?: 1.0) * (const ?: 1.0)))
        "i"     ->  String.format("%.3f", (delta ?: 0.0) / ((moli ?: 1.0) * (const ?: 1.0)))
        "K"     ->  String.format("%.3f", (delta ?: 0.0) / ((moli ?: 1.0) * (vanthoff ?: 1.0)))
        else    ->  String.format("%.3f", (moli ?: 0.0) * (vanthoff ?: 0.0) * (const ?: 0.0))
    }

    return parseNumber(temp)
}


fun resultAbbassamento(moli: Double?, vanthoff: Double?, const: Double?, delta: Double?, selection: String): Double {
    val temp = when (selection) {
        "m"     ->  String.format("%.3f", (delta ?: 0.0) / ((vanthoff ?: 1.0) * (const ?: 1.0)))
        "i"     ->  String.format("%.3f", (delta ?: 0.0) / ((moli ?: 1.0) * (const ?: 1.0)))
        "K"     ->  String.format("%.3f", (delta ?: 0.0) / ((moli ?: 1.0) * (vanthoff ?: 1.0)))
        else    ->  String.format("%.3f", (moli ?: 0.0) * (vanthoff ?: 0.0) * (const ?: 0.0))
    }

    return parseNumber(temp)
}


fun resultOsmotica(moli: Double?, temp: Double?, vanthoff: Double?, press: Double?, selection: String): Double {
    val r = 0.0821
    val t = when (selection) {
        "M"     ->  String.format("%.3f", (press ?: 0.0) / (r * (temp ?: 1.0) * (vanthoff ?: 1.0)))
        "T"     ->  String.format("%.3f", (press ?: 0.0) / ((moli ?: 1.0) * r * (vanthoff ?: 1.0)))
        "i"     ->  String.format("%.3f", (press ?: 0.0) / ((moli ?: 1.0) * r * (temp ?: 1.0)))
        else    ->  String.format("%.3f", (moli ?: 0.0) * r * (temp ?: 0.0) * (vanthoff ?: 0.0))
    }

    return parseNumber(t)
}


fun resultTensione(pSolv: Double?, x: Double?, pSol: Double?, selection: String): Double {
    val temp = when (selection) {
        "P slv" ->  String.format("%.3f", (pSol ?: 0.0) / (x ?: 1.0))
        "X"     ->  String.format("%.3f", (pSol ?: 0.0) / (pSolv ?: 1.0))
        else    ->  String.format("%.3f", (pSolv ?: 0.0) * (x ?: 0.0))
    }

    return parseNumber(temp)
}


fun resultGas(press: Double?, vol: Double?, mol: Double?, temp: Double?, selection: String): Double {
    val r = 0.0821
    val t = when (selection) {
        "Mol"   ->  String.format("%.3f", (press ?: 0.0) * (vol ?: 0.0) / r * (temp ?: 1.0))
        "Temp"  ->  String.format("%.3f", (press ?: 0.0) * (vol ?: 0.0) / (mol ?: 1.0) * r)
        "Vol"   ->  String.format("%.3f", (mol ?: 0.0) * r * (temp ?: 0.0) / (press ?: 1.0))
        else    ->  String.format("%.3f", (mol ?: 0.0) * r * (temp ?: 0.0) / (vol ?: 1.0))
    }

    return parseNumber(t)
}


fun resultSoluto(sol: Double?, solv: Double?): Double {
    return parseNumber(String.format("%.3f", (sol ?: 0.0) / ((sol ?: 1.0) + (solv ?: 0.0))))
}


fun resultSolvente(sol: Double?, solv: Double?): Double {
    return parseNumber(String.format("%.3f", (solv ?: 0.0) / ((sol ?: 1.0) + (solv ?: 0.0))))
}


fun returnPh(conc: Double?): Double {
    if ((conc ?: 0.0) != 0.0) {
        return parseNumber(String.format("%.3f", -log10(conc ?: 1.0)))
    }
    return 0.0
}


fun returnPoh(conc: Double?): Double {
    if ((conc ?: 0.0) != 0.0) {
        return parseNumber(String.format("%.3f", 14 + log10(conc ?: 1.0)))
    }
    return 0.0
}


fun returnTampone(const: Double?, acido: Double?, sale: Double?): Double {
    val conc = (const ?: 0.0) * ((acido ?: 0.0) / (sale ?: 1.0))

    if (conc != 0.0) {
        return parseNumber(String.format("%.3f", -log10(conc)))
    }

    return 0.0
}

fun getFormula(elementi: List<ItemElement>): String {
    val moli: MutableList<Double> = mutableListOf()
    var formula = ""
    for (i in elementi) {
        moli.add(i.massa.toDouble() / Elemento().massaMolare(i.elemento))
    }

    val min = moli.min()

    for (i in 0 until moli.size) {
        formula += elementi[i].elemento
        if (moli[i] / min != 1.0) {
            formula += "${round(moli[i] / min)}"
        }
    }
    return formula
}