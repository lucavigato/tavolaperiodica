class Elemento {
    fun massaMolare(name: String): Double {
        return when (name) {
            "H"     ->      1.00794
            "He"    ->      4.002602
            "Li"    ->      6.941
            "Be"    ->      9.012182
            "B"     ->      10.811
            "C"     ->      12.0107
            "N"     ->      14.0067
            "O"     ->      15.9994
            "F"     ->      18.9984032
            "Ne"    ->      20.1797
            "Na"    ->      22.989770
            "Mg"    ->      24.3050
            "Al"    ->      26.98138
            "Si"    ->      28.0855
            "P"     ->      30.97361
            "S"     ->      32.065
            "Cl"    ->      3.453
            "Ar"    ->      39.948
            "K"     ->      39.0938
            "Ca"    ->      40.078
            "Sc"    ->      44.955910
            "Ti"    ->      47.867
            "V"     ->      50.9415
            "Cr"    ->      51.9961
            "Mn"    ->      54.938049
            "Fe"    ->      55.845
            "Co"    ->      58.933200
            "Ni"    ->      58.6934
            "Cu"    ->      63.5546
            "Zn"    ->      65.38
            "Ga"    ->      69.723
            "Ge"    ->      72.64
            "As"    ->      74.92160
            "Se"    ->      78.96
            "Br"    ->      79.904
            "Kr"    ->      83.798
            "Rb"    ->      85.4678
            "Sr"    ->      87.62
            "Y"     ->      88.9085
            "Zr"    ->      91.224
            "Nb"    ->      92.90638
            "Mo"    ->      95.94
            "Tc"    ->      98.0
            "Ru"    ->      101.07
            "Rh"    ->      102.90550
            "Pd"    ->      106.42
            "Ag"    ->      107.8682
            "Cd"    ->      112.411
            "In"    ->      114.818
            "Sn"    ->      118.710
            "Sb"    ->      121.760
            "Te"    ->      127.60
            "I"     ->      126.90447
            "Xe"    ->      131.293
            "Cs"    ->      132.90545
            "Ba"    ->      137.327
            "La"    ->      138.9055
            "Ce"    ->      140.116
            "Pr"    ->      140.90765
            "Nd"    ->      144.24
            "Pm"    ->      145.0
            "Sm"    ->      150.36
            "Eu"    ->      151.964
            "Gd"    ->      157.25
            "Tb"    ->      158.92534
            "Dy"    ->      162.500
            "Ho"    ->      164.93032
            "Er"    ->      167.259
            "Tm"    ->      168.93421
            "Yb"    ->      173.04
            "Lu"    ->      174.967
            "Hf"    ->      178.49
            "Ta"    ->      180.9479
            "W"     ->      183.84
            "Re"    ->      186.207
            "Os"    ->      190.23
            "Ir"    ->      192.217
            "Pt"    ->      195.084
            "Au"    ->      196.96657
            "Hg"    ->      200.59
            "Tl"    ->      204.3833
            "Pb"    ->      207.2
            "Bi"    ->      208.98038
            "Po"    ->      209.0
            "At"    ->      210.0
            "Rn"    ->      222.0
            "Fr"    ->      223.0
            "Ra"    ->      226.0
            "Ac"    ->      227.0
            "Th"    ->      232.0381
            "Pa"    ->      231.039
            "U"     ->      238.0289
            "Np"    ->      237.0
            "Pu"    ->      244.0
            "Am"    ->      243.0
            "Cm"    ->      247.0
            "Bk"    ->      247.0
            "Cf"    ->      251.0
            "Es"    ->      252.0
            "Fm"    ->      257.0
            "Md"    ->      258.0
            "No"    ->      259.0
            "Lr"    ->      262.0
            "Rf"    ->      261.0
            "Db"    ->      262.0
            "Sg"    ->      266.0
            "Bh"    ->      264.0
            "Hs"    ->      269.0
            "Mt"    ->      278.0
            "Ds"    ->      281.0
            "Rg"    ->      282.0
            "Cn"    ->      285.0
            "Nh"    ->      286.0
            "Fl"    ->      289.0
            "Mc"    ->      289.0
            "Lv"    ->      293.0
            "Ts"    ->      310.0
            "Og"    ->      314.0
            else    ->      0.0
        }
    }

    fun nItaElem(name: String): String {
        return when (name) {
            "H"     ->      "Idrogeno"
            "He"    ->      "Elio"
            "Li"    ->      "Litio"
            "Be"    ->      "Berillio"
            "B"     ->      "Boro"
            "C"     ->      "Carbonio"
            "N"     ->      "Azoto"
            "O"     ->      "Ossigeno"
            "F"     ->      "Fluoro"
            "Ne"    ->      "Neon"
            "Na"    ->      "Sodio"
            "Mg"    ->      "Magnesio"
            "Al"    ->      "Alluminio"
            "Si"    ->      "Silicio"
            "P"     ->      "Fosforo"
            "S"     ->      "Zolfo"
            "Cl"    ->      "Cloro"
            "Ar"    ->      "Argon"
            "K"     ->      "Potassio"
            "Ca"    ->      "Calcio"
            "Sc"    ->      "Scandio"
            "Ti"    ->      "Titanio"
            "V"     ->      "Vanadio"
            "Cr"    ->      "Cromo"
            "Mn"    ->      "Manganese"
            "Fe"    ->      "Ferro"
            "Co"    ->      "Cobalto"
            "Ni"    ->      "Nichel"
            "Cu"    ->      "Rame"
            "Zn"    ->      "Zinco"
            "Ga"    ->      "Gallio"
            "Ge"    ->      "Germanio"
            "As"    ->      "Arsenico"
            "Se"    ->      "Selenio"
            "Br"    ->      "Bromo"
            "Kr"    ->      "Cripton"
            "Rb"    ->      "Rubidio"
            "Sr"    ->      "Stronzio"
            "Y"     ->      "Ittirio"
            "Zr"    ->      "Zirconio"
            "Nb"    ->      "Niobio"
            "Mo"    ->      "Molibdeno"
            "Tc"    ->      "Tecnezio"
            "Ru"    ->      "Rutenio"
            "Rh"    ->      "Rodio"
            "Pd"    ->      "Palladio"
            "Ag"    ->      "Argento"
            "Cd"    ->      "Cadmio"
            "In"    ->      "Indio"
            "Sn"    ->      "Stagno"
            "Sb"    ->      "Antimonio"
            "Te"    ->      "Tecnezio"
            "I"     ->      "Iodio"
            "Xe"    ->      "Xenon"
            "Cs"    ->      "Cesio"
            "Ba"    ->      "Bario"
            "La"    ->      "Lantanio"
            "Ce"    ->      "Cerio"
            "Pr"    ->      "Praseodimio"
            "Nd"    ->      "Neodimio"
            "Pm"    ->      "Promezio"
            "Sm"    ->      "Samario"
            "Eu"    ->      "Europio"
            "Gd"    ->      "Gadolinio"
            "Tb"    ->      "Terbio"
            "Dy"    ->      "Disprosio"
            "Ho"    ->      "Olmio"
            "Er"    ->      "Erbio"
            "Tm"    ->      "Tulio"
            "Yb"    ->      "Itterbio"
            "Lu"    ->      "Lutezio"
            "Hf"    ->      "Afnio"
            "Ta"    ->      "Tantalio"
            "W"     ->      "Tungsteno"
            "Re"    ->      "Renio"
            "Os"    ->      "Osmio"
            "Ir"    ->      "Iridio"
            "Pt"    ->      "Platino"
            "Au"    ->      "Oro"
            "Hg"    ->      "Mercurio"
            "Tl"    ->      "Tallio"
            "Pb"    ->      "Piombo"
            "Bi"    ->      "Bismuto"
            "Po"    ->      "Polonio"
            "At"    ->      "Astato"
            "Rn"    ->      "Radon"
            "Fr"    ->      "Francio"
            "Ra"    ->      "Radio"
            "Ac"    ->      "Attinio"
            "Th"    ->      "Torio"
            "Pa"    ->      "Protoattinio"
            "U"     ->      "Uranio"
            "Np"    ->      "Nettunio"
            "Pu"    ->      "Plutonio"
            "Am"    ->      "Americio"
            "Cm"    ->      "Curio"
            "Bk"    ->      "Berkelio"
            "Cf"    ->      "Californio"
            "Es"    ->      "Einsteinio"
            "Fm"    ->      "Fermio"
            "Md"    ->      "Mendelevio"
            "No"    ->      "Nobelio"
            "Lr"    ->      "Laurenzio"
            "Rf"    ->      "Rutherfordio"
            "Db"    ->      "Dubnio"
            "Sg"    ->      "Seaborgio"
            "Bh"    ->      "Bohrio"
            "Hs"    ->      "Hassio"
            "Mt"    ->      "Meitnerio"
            "Ds"    ->      "Darmstadio"
            "Rg"    ->      "Roentgenio"
            "Cn"    ->      "Copernicio"
            "Nh"    ->      "Nihonio"
            "Fl"    ->      "Flerovio"
            "Mc"    ->      "Moscovio"
            "Lv"    ->      "Livermorio"
            "Ts"    ->      "Tennessinio"
            "Og"    ->      "Oganessio"
            else    ->      ""
        }
    }

    fun ossidazione(name: String): String {
        return when (name) {
            "H"     ->      "+1, -1"
            "He"    ->      ""
            "Li"    ->      "+1"
            "Be"    ->      "+2"
            "B"     ->      "+3"
            "C"     ->      "+2, +4, -4"
            "N"     ->      "+2, +3, +4, +5, -3"
            "O"     ->      "-2"
            "F"     ->      "-1"
            "Ne"    ->      ""
            "Na"    ->      "+1"
            "Mg"    ->      "+2"
            "Al"    ->      "+3"
            "Si"    ->      "+2, +4, -4"
            "P"     ->      "+3, +5, -3"
            "S"     ->      "+4, +6, -2"
            "Cl"    ->      "+1, +3, +5, +7, -1"
            "Ar"    ->      ""
            "K"     ->      "+1"
            "Ca"    ->      "+2"
            "Sc"    ->      "+3"
            "Ti"    ->      "+2, +3, +4"
            "V"     ->      "+2, +3, +4, +5"
            "Cr"    ->      "+2, +3, +6"
            "Mn"    ->      "+2, +3, +4, +6, +7"
            "Fe"    ->      "+2, +3"
            "Co"    ->      "+2, +3"
            "Ni"    ->      "+2, +3"
            "Cu"    ->      "+1, +2"
            "Zn"    ->      "+2"
            "Ga"    ->      "+3"
            "Ge"    ->      "+2, +4"
            "As"    ->      "+3, +5, -3"
            "Se"    ->      "+4, +6, -2"
            "Br"    ->      "+1, +3, +5, -1"
            "Kr"    ->      ""
            "Rb"    ->      "+1"
            "Sr"    ->      "+2"
            "Y"     ->      "+3"
            "Zr"    ->      "+4"
            "Nb"    ->      "+3, +5"
            "Mo"    ->      "+1, +2, +3, +4, +5, +6"
            "Tc"    ->      "+4, +5, +6, +7"
            "Ru"    ->      "+2, +3, +4, +5, +6, +7"
            "Rh"    ->      "+3"
            "Pd"    ->      "+2, +4"
            "Ag"    ->      "+1"
            "Cd"    ->      "+2"
            "In"    ->      "+3"
            "Sn"    ->      "+2, +4"
            "Sb"    ->      "+3, +5, -3"
            "Te"    ->      "+4, +6, -2"
            "I"     ->      "+1, +5, +7, -1"
            "Xe"    ->      ""
            "Cs"    ->      "+1"
            "Ba"    ->      "+2"
            "La"    ->      "+3"
            "Ce"    ->      "+3, +4"
            "Pr"    ->      "+3"
            "Nd"    ->      "+3"
            "Pm"    ->      "+3"
            "Sm"    ->      "+2, +3"
            "Eu"    ->      "+2, +3"
            "Gd"    ->      "+3"
            "Tb"    ->      "+3"
            "Dy"    ->      "+3"
            "Ho"    ->      "+3"
            "Er"    ->      "+3"
            "Tm"    ->      "+2, +3"
            "Yb"    ->      "+2, +3"
            "Lu"    ->      "+3"
            "Hf"    ->      "+4"
            "Ta"    ->      "+5"
            "W"     ->      "+2, +3, +4, +5, +6"
            "Re"    ->      "+4, +6, +7"
            "Os"    ->      "+2, +3, +4, +6, +8"
            "Ir"    ->      "+3, +4"
            "Pt"    ->      "+2, +4"
            "Au"    ->      "+1, +3"
            "Hg"    ->      "+1, +2"
            "Tl"    ->      "+1, +3"
            "Pb"    ->      "+2, +4"
            "Bi"    ->      "+3, +5"
            "Po"    ->      "+2, +4, +6"
            "At"    ->      "+1, +3, +5, +7, -1"
            "Rn"    ->      ""
            "Fr"    ->      "+1"
            "Ra"    ->      "+2"
            "Ac"    ->      "+3"
            "Th"    ->      "+4"
            "Pa"    ->      "+4, +5"
            "U"     ->      "+3, +4, +5, +6"
            "Np"    ->      "+3, +4, +5, +6"
            "Pu"    ->      "+3, +4, +5, +6"
            "Am"    ->      "+3, +4, +5, +6"
            "Cm"    ->      "+3"
            "Bk"    ->      "+3, +4"
            "Cf"    ->      "+3"
            "Es"    ->      "+3"
            "Fm"    ->      "+3"
            "Md"    ->      "+2, +3"
            "No"    ->      "+2, +3"
            "Lr"    ->      "+3"
            "Rf"    ->      "+4"
            "Db"    ->      ""
            "Sg"    ->      ""
            "Bh"    ->      ""
            "Hs"    ->      ""
            "Mt"    ->      ""
            "Ds"    ->      ""
            "Rg"    ->      ""
            "Cn"    ->      ""
            "Nh"    ->      ""
            "Fl"    ->      ""
            "Mc"    ->      ""
            "Lv"    ->      ""
            "Ts"    ->      ""
            "Og"    ->      ""
            else    ->      ""
        }
    }

    fun numero(name: String): Int {
        return when (name) {
            "H"     ->      1
            "He"    ->      2
            "Li"    ->      3
            "Be"    ->      4
            "B"     ->      5
            "C"     ->      6
            "N"     ->      7
            "O"     ->      8
            "F"     ->      9
            "Ne"    ->      10
            "Na"    ->      11
            "Mg"    ->      12
            "Al"    ->      13
            "Si"    ->      14
            "P"     ->      15
            "S"     ->      16
            "Cl"    ->      17
            "Ar"    ->      18
            "K"     ->      19
            "Ca"    ->      20
            "Sc"    ->      21
            "Ti"    ->      22
            "V"     ->      23
            "Cr"    ->      24
            "Mn"    ->      25
            "Fe"    ->      26
            "Co"    ->      27
            "Ni"    ->      28
            "Cu"    ->      29
            "Zn"    ->      30
            "Ga"    ->      31
            "Ge"    ->      32
            "As"    ->      33
            "Se"    ->      34
            "Br"    ->      35
            "Kr"    ->      36
            "Rb"    ->      37
            "Sr"    ->      38
            "Y"     ->      39
            "Zr"    ->      40
            "Nb"    ->      41
            "Mo"    ->      42
            "Tc"    ->      43
            "Ru"    ->      44
            "Rh"    ->      45
            "Pd"    ->      46
            "Ag"    ->      47
            "Cd"    ->      48
            "In"    ->      49
            "Sn"    ->      50
            "Sb"    ->      51
            "Te"    ->      52
            "I"     ->      53
            "Xe"    ->      54
            "Cs"    ->      55
            "Ba"    ->      56
            "La"    ->      57
            "Ce"    ->      58
            "Pr"    ->      59
            "Nd"    ->      60
            "Pm"    ->      61
            "Sm"    ->      62
            "Eu"    ->      63
            "Gd"    ->      64
            "Tb"    ->      65
            "Dy"    ->      66
            "Ho"    ->      67
            "Er"    ->      68
            "Tm"    ->      69
            "Yb"    ->      70
            "Lu"    ->      71
            "Hf"    ->      72
            "Ta"    ->      73
            "W"     ->      74
            "Re"    ->      75
            "Os"    ->      76
            "Ir"    ->      77
            "Pt"    ->      78
            "Au"    ->      79
            "Hg"    ->      80
            "Tl"    ->      81
            "Pb"    ->      82
            "Bi"    ->      83
            "Po"    ->      84
            "At"    ->      85
            "Rn"    ->      86
            "Fr"    ->      87
            "Ra"    ->      88
            "Ac"    ->      89
            "Th"    ->      90
            "Pa"    ->      91
            "U"     ->      92
            "Np"    ->      93
            "Pu"    ->      94
            "Am"    ->      95
            "Cm"    ->      96
            "Bk"    ->      97
            "Cf"    ->      98
            "Es"    ->      99
            "Fm"    ->      100
            "Md"    ->      101
            "No"    ->      102
            "Lr"    ->      103
            "Rf"    ->      104
            "Db"    ->      105
            "Sg"    ->      106
            "Bh"    ->      107
            "Hs"    ->      108
            "Mt"    ->      109
            "Ds"    ->      110
            "Rg"    ->      111
            "Cn"    ->      112
            "Nh"    ->      113
            "Fl"    ->      114
            "Mc"    ->      115
            "Lv"    ->      116
            "Ts"    ->      117
            "Og"    ->      118
            else    ->      0
        }
    }

    fun classeIta(name: String): String {
        return when (name) {
            "H"     ->      "Non metalli"
            "He"    ->      "Gas nobili"
            "Li"    ->      "Metalli alcalini"
            "Be"    ->      "Metalli alcalino terrosi"
            "B"     ->      "Semimetalli"
            "C"     ->      "Non metalli"
            "N"     ->      "Non metalli"
            "O"     ->      "Non metalli"
            "F"     ->      "Alogeni"
            "Ne"    ->      "Gas nobili"
            "Na"    ->      "Metalli alcalini"
            "Mg"    ->      "Metalli alcalino terrosi"
            "Al"    ->      "Metalli del blocco p"
            "Si"    ->      "Semimetalli"
            "P"     ->      "Non metalli"
            "S"     ->      "Non metalli"
            "Cl"    ->      "Alogeni"
            "Ar"    ->      "Gas nobili"
            "K"     ->      "Metalli alcalini"
            "Ca"    ->      "Metalli alcalino terrosi"
            "Sc"    ->      "Metalli del blocco d"
            "Ti"    ->      "Metalli del blocco d"
            "V"     ->      "Metalli del blocco d"
            "Cr"    ->      "Metalli del blocco d"
            "Mn"    ->      "Metalli del blocco d"
            "Fe"    ->      "Metalli del blocco d"
            "Co"    ->      "Metalli del blocco d"
            "Ni"    ->      "Metalli del blocco d"
            "Cu"    ->      "Metalli del blocco d"
            "Zn"    ->      "Metalli del blocco d"
            "Ga"    ->      "Metalli del blocco p"
            "Ge"    ->      "Semimetalli"
            "As"    ->      "Semimetalli"
            "Se"    ->      "Non metalli"
            "Br"    ->      "Alogeni"
            "Kr"    ->      "Gas nobili"
            "Rb"    ->      "Metalli alcalini"
            "Sr"    ->      "Metalli alcalino terrosi"
            "Y"     ->      "Metalli del blocco d"
            "Zr"    ->      "Metalli del blocco d"
            "Nb"    ->      "Metalli del blocco d"
            "Mo"    ->      "Metalli del blocco d"
            "Tc"    ->      "Metalli del blocco d"
            "Ru"    ->      "Metalli del blocco d"
            "Rh"    ->      "Metalli del blocco d"
            "Pd"    ->      "Metalli del blocco d"
            "Ag"    ->      "Metalli del blocco d"
            "Cd"    ->      "Metalli del blocco d"
            "In"    ->      "Metalli del blocco p"
            "Sn"    ->      "Metalli del blocco p"
            "Sb"    ->      "Semimetalli"
            "Te"    ->      "Semimetalli"
            "I"     ->      "Alogeni"
            "Xe"    ->      "Gas nobili"
            "Cs"    ->      "Metalli alcalini"
            "Ba"    ->      "Metalli alcalino terrosi"
            "La"    ->      "Lantanidi"
            "Ce"    ->      "Lantanidi"
            "Pr"    ->      "Lantanidi"
            "Nd"    ->      "Lantanidi"
            "Pm"    ->      "Lantanidi"
            "Sm"    ->      "Lantanidi"
            "Eu"    ->      "Lantanidi"
            "Gd"    ->      "Lantanidi"
            "Tb"    ->      "Lantanidi"
            "Dy"    ->      "Lantanidi"
            "Ho"    ->      "Lantanidi"
            "Er"    ->      "Lantanidi"
            "Tm"    ->      "Lantanidi"
            "Yb"    ->      "Lantanidi"
            "Lu"    ->      "Lantanidi"
            "Hf"    ->      "Metalli del blocco d"
            "Ta"    ->      "Metalli del blocco d"
            "W"     ->      "Metalli del blocco d"
            "Re"    ->      "Metalli del blocco d"
            "Os"    ->      "Metalli del blocco d"
            "Ir"    ->      "Metalli del blocco d"
            "Pt"    ->      "Metalli del blocco d"
            "Au"    ->      "Metalli del blocco d"
            "Hg"    ->      "Metalli del blocco d"
            "Tl"    ->      "Metalli del blocco p"
            "Pb"    ->      "Metalli del blocco p"
            "Bi"    ->      "Metalli del blocco p"
            "Po"    ->      "Semimetalli"
            "At"    ->      "Alogeni"
            "Rn"    ->      "Gas nobili"
            "Fr"    ->      "Metalli alcalini"
            "Ra"    ->      "Metalli alcalino terrosi"
            "Ac"    ->      "Attinidi"
            "Th"    ->      "Attinidi"
            "Pa"    ->      "Attinidi"
            "U"     ->      "Attinidi"
            "Np"    ->      "Attinidi"
            "Pu"    ->      "Attinidi"
            "Am"    ->      "Attinidi"
            "Cm"    ->      "Attinidi"
            "Bk"    ->      "Attinidi"
            "Cf"    ->      "Attinidi"
            "Es"    ->      "Attinidi"
            "Fm"    ->      "Attinidi"
            "Md"    ->      "Attinidi"
            "No"    ->      "Attinidi"
            "Lr"    ->      "Attinidi"
            "Rf"    ->      "Metalli del blocco d"
            "Db"    ->      "Metalli del blocco d"
            "Sg"    ->      "Metalli del blocco d"
            "Bh"    ->      "Metalli del blocco d"
            "Hs"    ->      "Metalli del blocco d"
            "Mt"    ->      "Metalli del blocco d"
            "Ds"    ->      "Metalli del blocco d"
            "Rg"    ->      "Metalli del blocco d"
            "Cn"    ->      "Metalli del blocco d"
            "Nh"    ->      "Metalli del blocco p"
            "Fl"    ->      "Metalli del blocco p"
            "Mc"    ->      "Metalli del blocco p"
            "Lv"    ->      "Metalli del blocco p"
            "Ts"    ->      "Alogeni"
            "Og"    ->      "Gas nobili"
            else    ->      ""
        }
    }

    fun confEl(name: String): String {
        return when (name) {
            "H"     ->      "1s¹"
            "He"    ->      "1s²"
            "Li"    ->      "[He]2s¹"
            "Be"    ->      "[He]2s²"
            "B"     ->      "[He]2s²2p¹"
            "C"     ->      "[He]2s²2p²"
            "N"     ->      "[He]2s²2p³"
            "O"     ->      "[He]2s²2p⁴"
            "F"     ->      "[He]2s²2p⁵"
            "Ne"    ->      "[He]2s²2p⁶"
            "Na"    ->      "[Ne]3s¹"
            "Mg"    ->      "[Ne]3s²"
            "Al"    ->      "[Ne]3s²3p¹"
            "Si"    ->      "[Ne]3s²3p²"
            "P"     ->      "[Ne]3s²3p³"
            "S"     ->      "[Ne]3s²3p⁴"
            "Cl"    ->      "[Ne]3s²3p⁵"
            "Ar"    ->      "[Ne]3s²3p⁶"
            "K"     ->      "[Ar]4s¹"
            "Ca"    ->      "[Ar]4s²"
            "Sc"    ->      "[Ar]3d¹4s²"
            "Ti"    ->      "[Ar]3d²4s²"
            "V"     ->      "[Ar]3d³4s²"
            "Cr"    ->      "[Ar]3d⁵4s¹"
            "Mn"    ->      "[Ar]3d⁵4s²"
            "Fe"    ->      "[Ar]3d⁶4s²"
            "Co"    ->      "[Ar]3d⁷4s²"
            "Ni"    ->      "[Ar]3d⁸4s²"
            "Cu"    ->      "[Ar]3d¹⁰4s¹"
            "Zn"    ->      "[Ar]3d¹⁰4s²"
            "Ga"    ->      "[Ar]3d¹⁰4s²4p¹"
            "Ge"    ->      "[Ar]3d¹⁰4s²4p²"
            "As"    ->      "[Ar]3d¹⁰4s²4p³"
            "Se"    ->      "[Ar]3d¹⁰4s²4p⁴"
            "Br"    ->      "[Ar]3d¹⁰4s²4p⁵"
            "Kr"    ->      "[Ar]3d¹⁰4s²4p⁶"
            "Rb"    ->      "[Kr]5s¹"
            "Sr"    ->      "[Kr]5s²"
            "Y"     ->      "[Kr]4d¹5s²"
            "Zr"    ->      "[Kr]4d²5s²"
            "Nb"    ->      "[Kr]4d⁴5s¹"
            "Mo"    ->      "[Kr]4d⁵5s¹"
            "Tc"    ->      "[Kr]4d⁵5s²"
            "Ru"    ->      "[Kr]4d⁷5s¹"
            "Rh"    ->      "[Kr]4d⁸5s¹"
            "Pd"    ->      "[Kr]4d¹⁰"
            "Ag"    ->      "[Kr]4d¹⁰5s¹"
            "Cd"    ->      "[Kr]4d¹⁰5s²"
            "In"    ->      "[Kr]4d¹⁰5s²5p¹"
            "Sn"    ->      "[Kr]4d¹⁰5s²5p²"
            "Sb"    ->      "[Kr]4d¹⁰5s²5p³"
            "Te"    ->      "[Kr]4d¹⁰5s²5p⁴"
            "I"     ->      "[Kr]4d¹⁰5s²5p⁵"
            "Xe"    ->      "[Kr]4d¹⁰5s²5p⁶"
            "Cs"    ->      "[Xe]6s¹"
            "Ba"    ->      "[Xe]6s²"
            "La"    ->      "[Xe]5d¹6s²"
            "Ce"    ->      "[Xe]4f¹5¹6s²"
            "Pr"    ->      "[Xe]4f³6s²"
            "Nd"    ->      "[Xe]4f⁴6s²"
            "Pm"    ->      "[Xe]4f⁵6s²"
            "Sm"    ->      "[Xe]4f⁶6s²"
            "Eu"    ->      "[Xe]4f⁷6s²"
            "Gd"    ->      "[Xe]4f⁷5d¹6s²"
            "Tb"    ->      "[Xe]4f⁹6s²"
            "Dy"    ->      "[Xe]4f¹⁰6s²"
            "Ho"    ->      "[Xe]4f¹¹6s²"
            "Er"    ->      "[Xe]4f¹²6s²"
            "Tm"    ->      "[Xe]4f¹³6s²"
            "Yb"    ->      "[Xe]4f¹⁴6s²"
            "Lu"    ->      "[Xe]4f¹⁴5d¹6s²"
            "Hf"    ->      "[Xe]4f¹⁴5d²6s²"
            "Ta"    ->      "[Xe]4f¹⁴5d³6s²"
            "W"     ->      "[Xe]4f¹⁴5d⁴6s²"
            "Re"    ->      "[Xe]4f¹⁴5d⁵6s²"
            "Os"    ->      "[Xe]4f¹⁴5d⁶6s²"
            "Ir"    ->      "[Xe]4f¹⁴5d⁷6s²"
            "Pt"    ->      "[Xe]4f¹⁴5d⁹6s¹"
            "Au"    ->      "[Xe]4f¹⁴5d¹⁰6s¹"
            "Hg"    ->      "[Xe]4f¹⁴5d¹⁰6s²"
            "Tl"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p¹"
            "Pb"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p²"
            "Bi"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p³"
            "Po"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p⁴"
            "At"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p⁵"
            "Rn"    ->      "[Xe]4f¹⁴5d¹⁰6s²6p⁶"
            "Fr"    ->      "[Rn]7s¹"
            "Ra"    ->      "[Rn]7s²"
            "Ac"    ->      "[Rn]6d¹7s²"
            "Th"    ->      "[Rn]6d²7s²"
            "Pa"    ->      "[Rn]5f²6d¹7s²"
            "U"     ->      "[Rn]5f³6d¹7s²"
            "Np"    ->      "[Rn]5f⁴6d¹7s²"
            "Pu"    ->      "[Rn]5f⁶7s²"
            "Am"    ->      "[Rn]5f⁷7s²"
            "Cm"    ->      "[Rn]5f⁷6d¹7s²"
            "Bk"    ->      "[Rn]5f⁹7s²"
            "Cf"    ->      "[Rn]5f¹⁰7s²"
            "Es"    ->      "[Rn]5f¹¹7s²"
            "Fm"    ->      "[Rn]5f¹²7s²"
            "Md"    ->      "[Rn]5f¹³7s²"
            "No"    ->      "[Rn]5f¹⁴7s²"
            "Lr"    ->      "[Rn]5f¹⁴6d¹7s²"
            "Rf"    ->      "[Rn]5f¹⁴6d²7s²"
            "Db"    ->      "[Rn]5f¹⁴6d³7s²"
            "Sg"    ->      "[Rn]5f¹⁴6d⁴7s²"
            "Bh"    ->      "[Rn]5f¹⁴6d⁵7s²"
            "Hs"    ->      "[Rn]5f¹⁴6d⁶7s²"
            "Mt"    ->      "[Rn]5f¹⁴6d⁷7s²"
            "Ds"    ->      "[Rn]5f¹⁴6d⁸7s²"
            "Rg"    ->      "[Rn]5f¹⁴6d¹⁰7s¹"
            "Cn"    ->      "[Rn]5f¹⁴6d¹⁰7s²"
            "Nh"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p¹"
            "Fl"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p²"
            "Mc"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p³"
            "Lv"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p⁴"
            "Ts"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p⁵"
            "Og"    ->      "[Rn]5f¹⁴6d¹⁰7s²7p⁶"
            else    ->      ""
        }
    }

    fun fullConfEl(name: String): String {
        return when (name) {
            "H"     ->  "1s¹"
            "He"    ->  "1s²"
            "Li"    ->  "1s²2s¹"
            "Be"    ->  "1s²2s²"
            "B"     ->  "1s²2s²2p¹"
            "C"     ->  "1s²2s²2p²"
            "N"     ->  "1s²2s²2p³"
            "O"     ->  "1s²2s²2p⁴"
            "F"     ->  "1s²2s²2p⁵"
            "Ne"    ->  "1s²2s²2p⁶"
            "Na"    ->  "1s²2s²2p⁶3s¹"
            "Mg"    ->  "1s²2s²2p⁶3s²"
            "Al"    ->  "1s²2s²2p⁶3s²3p¹"
            "Si"    ->  "1s²2s²2p⁶3s²3p²"
            "P"     ->  "1s²2s²2p⁶3s²3p³"
            "S"     ->  "1s²2s²2p⁶3s²3p⁴"
            "Cl"    ->  "1s²2s²2p⁶3s²3p⁵"
            "Ar"    ->  "1s²2s²2p⁶3s²3p⁶"
            "K"     ->  "1s²2s²2p⁶3s²3p⁶4s¹"
            "Ca"    ->  "1s²2s²2p⁶3s²3p⁶4s²"
            "Sc"    ->  "1s²2s²2p⁶3s²3p⁶3d¹4s²"
            "Ti"    ->  "1s²2s²2p⁶3s²3p⁶3d²4s²"
            "V"     ->  "1s²2s²2p⁶3s²3p⁶3d³4s²"
            "Cr"    ->  "1s²2s²2p⁶3s²3p⁶3d⁵4s¹"
            "Mn"    ->  "1s²2s²2p⁶3s²3p⁶3d⁵4s²"
            "Fe"    ->  "1s²2s²2p⁶3s²3p⁶3d⁶4s²"
            "Co"    ->  "1s²2s²2p⁶3s²3p⁶3d⁷4s²"
            "Ni"    ->  "1s²2s²2p⁶3s²3p⁶3d⁸4s²"
            "Cu"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s¹"
            "Zn"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²"
            "Ga"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p¹"
            "Ge"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p²"
            "As"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p³"
            "Se"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁴"
            "Br"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁵"
            "Kr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶"
            "Rb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶5s¹"
            "Sr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶5s²"
            "Y"     ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹5s²"
            "Zr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d²5s²"
            "Nb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d⁴5s¹"
            "Mo"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d⁵5s¹"
            "Tc"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d⁵5s²"
            "Ru"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d⁷5s¹"
            "Rh"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d⁸5s¹"
            "Pd"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰"
            "Ag"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s¹"
            "Cd"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²"
            "In"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p¹"
            "Sn"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p²"
            "Sb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p³"
            "Te"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁴"
            "I"     ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁵"
            "Xe"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶"
            "Cs"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶6s¹"
            "Ba"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶6s²"
            "La"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶5d¹6s²"
            "Ce"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹5¹6s²"
            "Pr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f³6s²"
            "Nd"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁴6s²"
            "Pm"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁵6s²"
            "Sm"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁶6s²"
            "Eu"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁷6s²"
            "Gd"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁷5d¹6s²"
            "Tb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f⁹6s²"
            "Dy"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁰6s²"
            "Ho"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹¹6s²"
            "Er"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹²6s²"
            "Tm"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹³6s²"
            "Yb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴6s²"
            "Lu"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹6s²"
            "Hf"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d²6s²"
            "Ta"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d³6s²"
            "W"     ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d⁴6s²"
            "Re"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d⁵6s²"
            "Os"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d⁶6s²"
            "Ir"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d⁷6s²"
            "Pt"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d⁹6s¹"
            "Au"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s¹"
            "Hg"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²"
            "Tl"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p¹"
            "Pb"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p²"
            "Bi"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p³"
            "Po"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁴"
            "At"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁵"
            "Rn"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶"
            "Fr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶7s¹"
            "Ra"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶7s²"
            "Ac"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶6d¹7s²"
            "Th"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶6d²7s²"
            "Pa"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f²6d¹7s²"
            "U"     ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f³6d¹7s²"
            "Np"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f⁴6d¹7s²"
            "Pu"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f⁶7s²"
            "Am"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f⁷7s²"
            "Cm"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f⁷6d¹7s²"
            "Bk"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f⁹7s²"
            "Cf"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁰7s²"
            "Es"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹¹7s²"
            "Fm"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹²7s²"
            "Md"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹³7s²"
            "No"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴7s²"
            "Lr"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹7s²"
            "Rf"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d²7s²"
            "Db"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d³7s²"
            "Sg"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d⁴7s²"
            "Bh"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d⁵7s²"
            "Hs"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d⁶7s²"
            "Mt"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d⁷7s²"
            "Ds"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d⁸7s²"
            "Rg"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s¹"
            "Cn"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²"
            "Nh"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p¹"
            "Fl"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p²"
            "Mc"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p³"
            "Lv"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p⁴"
            "Ts"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p⁵"
            "Og"    ->  "1s²2s²2p⁶3s²3p⁶3d¹⁰4s²4p⁶4d¹⁰5s²5p⁶4f¹⁴5d¹⁰6s²6p⁶5f¹⁴6d¹⁰7s²7p⁶"
            else    ->  ""
        }
    }

    fun elettro(name: String): Double {
        return when (name) {
            "H"     ->      2.2
            "He"    ->      0.0
            "Li"    ->      0.98
            "Be"    ->      1.57
            "B"     ->      2.04
            "C"     ->      2.55
            "N"     ->      3.04
            "O"     ->      3.44
            "F"     ->      3.98
            "Ne"    ->      0.0
            "Na"    ->      0.93
            "Mg"    ->      1.31
            "Al"    ->      1.61
            "Si"    ->      1.9
            "P"     ->      2.19
            "S"     ->      2.58
            "Cl"    ->      3.16
            "Ar"    ->      0.0
            "K"     ->      0.82
            "Ca"    ->      1.0
            "Sc"    ->      1.36
            "Ti"    ->      1.54
            "V"     ->      1.63
            "Cr"    ->      1.66
            "Mn"    ->      1.55
            "Fe"    ->      1.83
            "Co"    ->      1.88
            "Ni"    ->      1.91
            "Cu"    ->      1.9
            "Zn"    ->      1.65
            "Ga"    ->      1.81
            "Ge"    ->      2.01
            "As"    ->      2.18
            "Se"    ->      2.55
            "Br"    ->      2.96
            "Kr"    ->      3.0
            "Rb"    ->      0.82
            "Sr"    ->      0.95
            "Y"     ->      1.22
            "Zr"    ->      1.33
            "Nb"    ->      1.6
            "Mo"    ->      2.16
            "Tc"    ->      1.9
            "Ru"    ->      2.2
            "Rh"    ->      2.28
            "Pd"    ->      2.2
            "Ag"    ->      1.93
            "Cd"    ->      1.69
            "In"    ->      1.78
            "Sn"    ->      1.96
            "Sb"    ->      2.05
            "Te"    ->      2.1
            "I"     ->      2.66
            "Xe"    ->      2.6
            "Cs"    ->      0.79
            "Ba"    ->      0.89
            "La"    ->      1.1
            "Ce"    ->      1.12
            "Pr"    ->      1.13
            "Nd"    ->      1.14
            "Pm"    ->      0.0
            "Sm"    ->      1.17
            "Eu"    ->      0.0
            "Gd"    ->      1.2
            "Tb"    ->      1.2
            "Dy"    ->      1.22
            "Ho"    ->      1.23
            "Er"    ->      1.24
            "Tm"    ->      1.25
            "Yb"    ->      1.1
            "Lu"    ->      1.27
            "Hf"    ->      1.3
            "Ta"    ->      1.5
            "W"     ->      2.36
            "Re"    ->      1.9
            "Os"    ->      2.2
            "Ir"    ->      2.2
            "Pt"    ->      2.28
            "Au"    ->      2.54
            "Hg"    ->      1.9
            "Tl"    ->      2.04
            "Pb"    ->      2.33
            "Bi"    ->      2.02
            "Po"    ->      2.0
            "At"    ->      2.2
            "Rn"    ->      0.0
            "Fr"    ->      0.7
            "Ra"    ->      0.9
            "Ac"    ->      1.1
            "Th"    ->      1.3
            "Pa"    ->      1.5
            "U"     ->      1.38
            "Np"    ->      1.36
            "Pu"    ->      1.28
            "Am"    ->      1.3
            "Cm"    ->      1.3
            "Bk"    ->      1.3
            "Cf"    ->      1.3
            "Es"    ->      1.3
            "Fm"    ->      1.3
            "Md"    ->      1.3
            "No"    ->      1.3
            "Lr"    ->      1.3
            "Rf"    ->      0.0
            "Db"    ->      0.0
            "Sg"    ->      0.0
            "Bh"    ->      0.0
            "Hs"    ->      0.0
            "Mt"    ->      0.0
            "Ds"    ->      0.0
            "Rg"    ->      0.0
            "Cn"    ->      0.0
            "Nh"    ->      0.0
            "Fl"    ->      0.0
            "Mc"    ->      0.0
            "Lv"    ->      0.0
            "Ts"    ->      0.0
            "Og"    ->      0.0
            else    ->      0.0
        }
    }

    fun satpIta(name: String): String {
        return when (name) {
            "H"     ->      "Gas"
            "He"    ->      "Gas"
            "Li"    ->      "Solido"
            "Be"    ->      "Solido"
            "B"     ->      "Solido"
            "C"     ->      "Solido"
            "N"     ->      "Gas"
            "O"     ->      "Gas"
            "F"     ->      "Gas"
            "Ne"    ->      "Gas"
            "Na"    ->      "Solido"
            "Mg"    ->      "Solido"
            "Al"    ->      "Solido"
            "Si"    ->      "Solido"
            "P"     ->      "Solido"
            "S"     ->      "Solido"
            "Cl"    ->      "Gas"
            "Ar"    ->      "Gas"
            "K"     ->      "Solido"
            "Ca"    ->      "Solido"
            "Sc"    ->      "Solido"
            "Ti"    ->      "Solido"
            "V"     ->      "Solido"
            "Cr"    ->      "Solido"
            "Mn"    ->      "Solido"
            "Fe"    ->      "Solido"
            "Co"    ->      "Solido"
            "Ni"    ->      "Solido"
            "Cu"    ->      "Solido"
            "Zn"    ->      "Solido"
            "Ga"    ->      "Solido"
            "Ge"    ->      "Solido"
            "As"    ->      "Solido"
            "Se"    ->      "Solido"
            "Br"    ->      "Liquido"
            "Kr"    ->      "Gas"
            "Rb"    ->      "Solido"
            "Sr"    ->      "Solido"
            "Y"     ->      "Solido"
            "Zr"    ->      "Solido"
            "Nb"    ->      "Solido"
            "Mo"    ->      "Solido"
            "Tc"    ->      "Solido"
            "Ru"    ->      "Solido"
            "Rh"    ->      "Solido"
            "Pd"    ->      "Solido"
            "Ag"    ->      "Solido"
            "Cd"    ->      "Solido"
            "In"    ->      "Solido"
            "Sn"    ->      "Solido"
            "Sb"    ->      "Solido"
            "Te"    ->      "Solido"
            "I"     ->      "Solido"
            "Xe"    ->      "Gas"
            "Cs"    ->      "Solido"
            "Ba"    ->      "Solido"
            "La"    ->      "Solido"
            "Ce"    ->      "Solido"
            "Pr"    ->      "Solido"
            "Nd"    ->      "Solido"
            "Pm"    ->      "Solido"
            "Sm"    ->      "Solido"
            "Eu"    ->      "Solido"
            "Gd"    ->      "Solido"
            "Tb"    ->      "Solido"
            "Dy"    ->      "Solido"
            "Ho"    ->      "Solido"
            "Er"    ->      "Solido"
            "Tm"    ->      "Solido"
            "Yb"    ->      "Solido"
            "Lu"    ->      "Solido"
            "Hf"    ->      "Solido"
            "Ta"    ->      "Solido"
            "W"     ->      "Solido"
            "Re"    ->      "Solido"
            "Os"    ->      "Solido"
            "Ir"    ->      "Solido"
            "Pt"    ->      "Solido"
            "Au"    ->      "Solido"
            "Hg"    ->      "Liquido"
            "Tl"    ->      "Solido"
            "Pb"    ->      "Solido"
            "Bi"    ->      "Solido"
            "Po"    ->      "Solido"
            "At"    ->      "Solido"
            "Rn"    ->      "Gas"
            "Fr"    ->      "Solido"
            "Ra"    ->      "Solido"
            "Ac"    ->      "Solido"
            "Th"    ->      "Solido"
            "Pa"    ->      "Solido"
            "U"     ->      "Solido"
            "Np"    ->      "Solido"
            "Pu"    ->      "Solido"
            "Am"    ->      "Solido"
            "Cm"    ->      "Solido"
            "Bk"    ->      "Solido"
            "Cf"    ->      "Solido"
            "Es"    ->      "Solido"
            "Fm"    ->      "Solido"
            "Md"    ->      "Solido"
            "No"    ->      "Solido"
            "Lr"    ->      "Solido"
            "Rf"    ->      "Solido"
            "Db"    ->      "Solido"
            "Sg"    ->      "Solido"
            "Bh"    ->      "Solido"
            "Hs"    ->      "Solido"
            "Mt"    ->      "Solido"
            "Ds"    ->      "Solido"
            "Rg"    ->      "Solido"
            "Cn"    ->      "Solido"
            "Nh"    ->      "Solido"
            "Fl"    ->      "Solido"
            "Mc"    ->      "Solido"
            "Lv"    ->      "Solido"
            "Ts"    ->      "Solido"
            "Og"    ->      "Solido"
            else    ->      ""
        }
    }

    fun satpEng(name: String): String {
        return when (name) {
            "H"     ->      "Gas"
            "He"    ->      "Gas"
            "Li"    ->      "Solid"
            "Be"    ->      "Solid"
            "B"     ->      "Solid"
            "C"     ->      "Solid"
            "N"     ->      "Gas"
            "O"     ->      "Gas"
            "F"     ->      "Gas"
            "Ne"    ->      "Gas"
            "Na"    ->      "Solid"
            "Mg"    ->      "Solid"
            "Al"    ->      "Solid"
            "Si"    ->      "Solid"
            "P"     ->      "Solid"
            "S"     ->      "Solid"
            "Cl"    ->      "Gas"
            "Ar"    ->      "Gas"
            "K"     ->      "Solid"
            "Ca"    ->      "Solid"
            "Sc"    ->      "Solid"
            "Ti"    ->      "Solid"
            "V"     ->      "Solid"
            "Cr"    ->      "Solid"
            "Mn"    ->      "Solid"
            "Fe"    ->      "Solid"
            "Co"    ->      "Solid"
            "Ni"    ->      "Solid"
            "Cu"    ->      "Solid"
            "Zn"    ->      "Solid"
            "Ga"    ->      "Solid"
            "Ge"    ->      "Solid"
            "As"    ->      "Solid"
            "Se"    ->      "Solid"
            "Br"    ->      "Liquid"
            "Kr"    ->      "Gas"
            "Rb"    ->      "Solid"
            "Sr"    ->      "Solid"
            "Y"     ->      "Solid"
            "Zr"    ->      "Solid"
            "Nb"    ->      "Solid"
            "Mo"    ->      "Solid"
            "Tc"    ->      "Solid"
            "Ru"    ->      "Solid"
            "Rh"    ->      "Solid"
            "Pd"    ->      "Solid"
            "Ag"    ->      "Solid"
            "Cd"    ->      "Solid"
            "In"    ->      "Solid"
            "Sn"    ->      "Solid"
            "Sb"    ->      "Solid"
            "Te"    ->      "Solid"
            "I"     ->      "Solid"
            "Xe"    ->      "Gas"
            "Cs"    ->      "Solid"
            "Ba"    ->      "Solid"
            "La"    ->      "Solid"
            "Ce"    ->      "Solid"
            "Pr"    ->      "Solid"
            "Nd"    ->      "Solid"
            "Pm"    ->      "Solid"
            "Sm"    ->      "Solid"
            "Eu"    ->      "Solid"
            "Gd"    ->      "Solid"
            "Tb"    ->      "Solid"
            "Dy"    ->      "Solid"
            "Ho"    ->      "Solid"
            "Er"    ->      "Solid"
            "Tm"    ->      "Solid"
            "Yb"    ->      "Solid"
            "Lu"    ->      "Solid"
            "Hf"    ->      "Solid"
            "Ta"    ->      "Solid"
            "W"     ->      "Solid"
            "Re"    ->      "Solid"
            "Os"    ->      "Solid"
            "Ir"    ->      "Solid"
            "Pt"    ->      "Solid"
            "Au"    ->      "Solid"
            "Hg"    ->      "Liquid"
            "Tl"    ->      "Solid"
            "Pb"    ->      "Solid"
            "Bi"    ->      "Solid"
            "Po"    ->      "Solid"
            "At"    ->      "Solid"
            "Rn"    ->      "Gas"
            "Fr"    ->      "Solid"
            "Ra"    ->      "Solid"
            "Ac"    ->      "Solid"
            "Th"    ->      "Solid"
            "Pa"    ->      "Solid"
            "U"     ->      "Solid"
            "Np"    ->      "Solid"
            "Pu"    ->      "Solid"
            "Am"    ->      "Solid"
            "Cm"    ->      "Solid"
            "Bk"    ->      "Solid"
            "Cf"    ->      "Solid"
            "Es"    ->      "Solid"
            "Fm"    ->      "Solid"
            "Md"    ->      "Solid"
            "No"    ->      "Solid"
            "Lr"    ->      "Solid"
            "Rf"    ->      "Solid"
            "Db"    ->      "Solid"
            "Sg"    ->      "Solid"
            "Bh"    ->      "Solid"
            "Hs"    ->      "Solid"
            "Mt"    ->      "Solid"
            "Ds"    ->      "Solid"
            "Rg"    ->      "Solid"
            "Cn"    ->      "Solid"
            "Nh"    ->      "Solid"
            "Fl"    ->      "Solid"
            "Mc"    ->      "Solid"
            "Lv"    ->      "Solid"
            "Ts"    ->      "Solid"
            "Og"    ->      "Solid"
            else    ->      ""
        }
    }

    fun fusione(name: String): Double {
        return when (name) {
            "H"     ->      14.0
            "He"    ->      1.0
            "Li"    ->      454.0
            "Be"    ->      1561.0
            "B"     ->      2573.15
            "C"     ->      0.0
            "N"     ->      63.0
            "O"     ->      54.0
            "F"     ->      53.0
            "Ne"    ->      24.0
            "Na"    ->      371.0
            "Mg"    ->      923.0
            "Al"    ->      933.0
            "Si"    ->      1687.0
            "P"     ->      317.0
            "S"     ->      388.0
            "Cl"    ->      172.0
            "Ar"    ->      84.0
            "K"     ->      336.0
            "Ca"    ->      1115.0
            "Sc"    ->      1814.0
            "Ti"    ->      1941.0
            "V"     ->      2183.0
            "Cr"    ->      2180.0
            "Mn"    ->      1517.0
            "Fe"    ->      1808.0
            "Co"    ->      1768.0
            "Ni"    ->      1728.0
            "Cu"    ->      1357.0
            "Zn"    ->      693.0
            "Ga"    ->      303.0
            "Ge"    ->      1210.0
            "As"    ->      1090.15
            "Se"    ->      494.0
            "Br"    ->      266.0
            "Kr"    ->      116.0
            "Rb"    ->      312.0
            "Sr"    ->      1050.0
            "Y"     ->      1796.0
            "Zr"    ->      2125.0
            "Nb"    ->      2741.0
            "Mo"    ->      2829.0
            "Tc"    ->      2430.0
            "Ru"    ->      2607.0
            "Rh"    ->      2239.0
            "Pd"    ->      1826.0
            "Ag"    ->      1235.0
            "Cd"    ->      594.0
            "In"    ->      430.0
            "Sn"    ->      505.0
            "Sb"    ->      904.0
            "Te"    ->      723.0
            "I"     ->      387.0
            "Xe"    ->      161.0
            "Cs"    ->      301.0
            "Ba"    ->      1000.0
            "La"    ->      1193.0
            "Ce"    ->      1071.0
            "Pr"    ->      1204.0
            "Nd"    ->      1283.0
            "Pm"    ->      1353.0
            "Sm"    ->      1345.0
            "Eu"    ->      1095.0
            "Gd"    ->      1584.0
            "Tb"    ->      1629.0
            "Dy"    ->      1682.0
            "Ho"    ->      1743.0
            "Er"    ->      1795.0
            "Tm"    ->      1818.0
            "Yb"    ->      1878.0
            "Lu"    ->      1929.0
            "Hf"    ->      2506.0
            "Ta"    ->      3290.0
            "W"     ->      3695.0
            "Re"    ->      3459.0
            "Os"    ->      3306.0
            "Ir"    ->      2719.0
            "Pt"    ->      2041.0
            "Au"    ->      1337.0
            "Hg"    ->      234.0
            "Tl"    ->      577.0
            "Pb"    ->      601.0
            "Bi"    ->      544.0
            "Po"    ->      527.0
            "At"    ->      575.0
            "Rn"    ->      202.0
            "Fr"    ->      300.0
            "Ra"    ->      973.0
            "Ac"    ->      1324.0
            "Th"    ->      2023.0
            "Pa"    ->      1845.0
            "U"     ->      1408.0
            "Np"    ->      913.0
            "Pu"    ->      914.0
            "Am"    ->      1449.0
            "Cm"    ->      1618.0
            "Bk"    ->      1323.0
            "Cf"    ->      1333.0
            "Es"    ->      1133.0
            "Fm"    ->      1800.0
            "Md"    ->      1100.0
            "No"    ->      0.0
            "Lr"    ->      0.0
            "Rf"    ->      0.0
            "Db"    ->      0.0
            "Sg"    ->      0.0
            "Bh"    ->      0.0
            "Hs"    ->      0.0
            "Mt"    ->      0.0
            "Ds"    ->      0.0
            "Rg"    ->      0.0
            "Cn"    ->      0.0
            "Nh"    ->      0.0
            "Fl"    ->      0.0
            "Mc"    ->      0.0
            "Lv"    ->      0.0
            "Ts"    ->      0.0
            "Og"    ->      0.0
            else    ->      0.0
        }
    }

    fun ebolli(name: String): Double {
        return when (name) {
            "H"     ->      20.0
            "He"    ->      4.0
            "Li"    ->      1615.0
            "Be"    ->      744.0
            "B"     ->      3923.15
            "C"     ->      3823.15
            "N"     ->      77.0
            "O"     ->      90.0
            "F"     ->      85.0
            "Ne"    ->      27.0
            "Na"    ->      1156.0
            "Mg"    ->      1363.0
            "Al"    ->      2792.0
            "Si"    ->      3553.0
            "P"     ->      553.0
            "S"     ->      718.0
            "Cl"    ->      238.0
            "Ar"    ->      87.0
            "K"     ->      1033.0
            "Ca"    ->      1757.0
            "Sc"    ->      3109.0
            "Ti"    ->      3560.0
            "V"     ->      3680.0
            "Cr"    ->      2945.0
            "Mn"    ->      2334.0
            "Fe"    ->      3134.0
            "Co"    ->      3200.0
            "Ni"    ->      3186.0
            "Cu"    ->      2840.0
            "Zn"    ->      1180.0
            "Ga"    ->      2477.0
            "Ge"    ->      3103.0
            "As"    ->      0.0
            "Se"    ->      958.0
            "Br"    ->      332.0
            "Kr"    ->      121.0
            "Rb"    ->      959.0
            "Sr"    ->      1657.0
            "Y"     ->      3618.0
            "Zr"    ->      4682.0
            "Nb"    ->      5015.0
            "Mo"    ->      4912.0
            "Tc"    ->      4538.0
            "Ru"    ->      4423.0
            "Rh"    ->      3968.0
            "Pd"    ->      3236.0
            "Ag"    ->      2435.0
            "Cd"    ->      1038.0
            "In"    ->      2345.0
            "Sn"    ->      2875.0
            "Sb"    ->      1860.0
            "Te"    ->      1261.0
            "I"     ->      457.0
            "Xe"    ->      166.0
            "Cs"    ->      942.0
            "Ba"    ->      2170.0
            "La"    ->      3727.0
            "Ce"    ->      3697.0
            "Pr"    ->      3793.0
            "Nd"    ->      3347.0
            "Pm"    ->      2730.0
            "Sm"    ->      2051.0
            "Eu"    ->      1870.0
            "Gd"    ->      3546.0
            "Tb"    ->      3503.0
            "Dy"    ->      2840.0
            "Ho"    ->      2993.0
            "Er"    ->      3141.0
            "Tm"    ->      2223.0
            "Yb"    ->      1700.0
            "Lu"    ->      3588.0
            "Hf"    ->      4875.0
            "Ta"    ->      5698.0
            "W"     ->      5928.0
            "Re"    ->      5900.0
            "Os"    ->      5300.0
            "Ir"    ->      4283.0
            "Pt"    ->      4100.0
            "Au"    ->      3129.0
            "Hg"    ->      630.0
            "Tl"    ->      1746.0
            "Pb"    ->      2013.0
            "Bi"    ->      1833.0
            "Po"    ->      1235.0
            "At"    ->      610.0
            "Rn"    ->      211.0
            "Fr"    ->      950.0
            "Ra"    ->      1413.0
            "Ac"    ->      3432.0
            "Th"    ->      5061.0
            "Pa"    ->      4029.0
            "U"     ->      4404.0
            "Np"    ->      4175.0
            "Pu"    ->      3501.0
            "Am"    ->      2284.0
            "Cm"    ->      0.0
            "Bk"    ->      0.0
            "Cf"    ->      0.0
            "Es"    ->      0.0
            "Fm"    ->      0.0
            "Md"    ->      0.0
            "No"    ->      0.0
            "Lr"    ->      0.0
            "Rf"    ->      0.0
            "Db"    ->      0.0
            "Sg"    ->      0.0
            "Bh"    ->      0.0
            "Hs"    ->      0.0
            "Mt"    ->      0.0
            "Ds"    ->      0.0
            "Rg"    ->      0.0
            "Cn"    ->      0.0
            "Nh"    ->      0.0
            "Fl"    ->      0.0
            "Mc"    ->      0.0
            "Lv"    ->      0.0
            "Ts"    ->      0.0
            "Og"    ->      0.0
            else    ->      0.0
        }
    }

    fun gruppo(name: String): Int {
        return when (name) {
            "H"     ->      1
            "He"    ->      18
            "Li"    ->      1
            "Be"    ->      2
            "B"     ->      13
            "C"     ->      14
            "N"     ->      15
            "O"     ->      16
            "F"     ->      17
            "Ne"    ->      18
            "Na"    ->      1
            "Mg"    ->      2
            "Al"    ->      13
            "Si"    ->      14
            "P"     ->      15
            "S"     ->      16
            "Cl"    ->      17
            "Ar"    ->      18
            "K"     ->      1
            "Ca"    ->      2
            "Sc"    ->      3
            "Ti"    ->      4
            "V"     ->      5
            "Cr"    ->      6
            "Mn"    ->      7
            "Fe"    ->      8
            "Co"    ->      9
            "Ni"    ->      10
            "Cu"    ->      11
            "Zn"    ->      12
            "Ga"    ->      13
            "Ge"    ->      14
            "As"    ->      15
            "Se"    ->      16
            "Br"    ->      17
            "Kr"    ->      18
            "Rb"    ->      1
            "Sr"    ->      2
            "Y"     ->      3
            "Zr"    ->      4
            "Nb"    ->      5
            "Mo"    ->      6
            "Tc"    ->      7
            "Ru"    ->      8
            "Rh"    ->      9
            "Pd"    ->      10
            "Ag"    ->      11
            "Cd"    ->      12
            "In"    ->      13
            "Sn"    ->      14
            "Sb"    ->      15
            "Te"    ->      16
            "I"     ->      17
            "Xe"    ->      18
            "Cs"    ->      1
            "Ba"    ->      2
            "La"    ->      3
            "Ce"    ->      0
            "Pr"    ->      0
            "Nd"    ->      0
            "Pm"    ->      0
            "Sm"    ->      0
            "Eu"    ->      0
            "Gd"    ->      0
            "Tb"    ->      0
            "Dy"    ->      0
            "Ho"    ->      0
            "Er"    ->      0
            "Tm"    ->      0
            "Yb"    ->      0
            "Lu"    ->      0
            "Hf"    ->      4
            "Ta"    ->      5
            "W"     ->      6
            "Re"    ->      7
            "Os"    ->      8
            "Ir"    ->      9
            "Pt"    ->      10
            "Au"    ->      11
            "Hg"    ->      12
            "Tl"    ->      13
            "Pb"    ->      14
            "Bi"    ->      15
            "Po"    ->      16
            "At"    ->      17
            "Rn"    ->      18
            "Fr"    ->      1
            "Ra"    ->      2
            "Ac"    ->      3
            "Th"    ->      0
            "Pa"    ->      0
            "U"     ->      0
            "Np"    ->      0
            "Pu"    ->      0
            "Am"    ->      0
            "Cm"    ->      0
            "Bk"    ->      0
            "Cf"    ->      0
            "Es"    ->      0
            "Fm"    ->      0
            "Md"    ->      0
            "No"    ->      0
            "Lr"    ->      0
            "Rf"    ->      4
            "Db"    ->      5
            "Sg"    ->      6
            "Bh"    ->      7
            "Hs"    ->      8
            "Mt"    ->      9
            "Ds"    ->      10
            "Rg"    ->      11
            "Cn"    ->      12
            "Nh"    ->      13
            "Fl"    ->      14
            "Mc"    ->      15
            "Lv"    ->      16
            "Ts"    ->      17
            "Og"    ->      18
            else    ->      0
        }
    }

    fun periodo(name: String): Int {
        return when (name) {
            "H"     ->      1
            "He"    ->      1
            "Li"    ->      2
            "Be"    ->      2
            "B"     ->      2
            "C"     ->      2
            "N"     ->      2
            "O"     ->      2
            "F"     ->      2
            "Ne"    ->      2
            "Na"    ->      3
            "Mg"    ->      3
            "Al"    ->      3
            "Si"    ->      3
            "P"     ->      3
            "S"     ->      3
            "Cl"    ->      3
            "Ar"    ->      3
            "K"     ->      4
            "Ca"    ->      4
            "Sc"    ->      4
            "Ti"    ->      4
            "V"     ->      4
            "Cr"    ->      4
            "Mn"    ->      4
            "Fe"    ->      4
            "Co"    ->      4
            "Ni"    ->      4
            "Cu"    ->      4
            "Zn"    ->      4
            "Ga"    ->      4
            "Ge"    ->      4
            "As"    ->      4
            "Se"    ->      4
            "Br"    ->      4
            "Kr"    ->      4
            "Rb"    ->      5
            "Sr"    ->      5
            "Y"     ->      5
            "Zr"    ->      5
            "Nb"    ->      5
            "Mo"    ->      5
            "Tc"    ->      5
            "Ru"    ->      5
            "Rh"    ->      5
            "Pd"    ->      5
            "Ag"    ->      5
            "Cd"    ->      5
            "In"    ->      5
            "Sn"    ->      5
            "Sb"    ->      5
            "Te"    ->      5
            "I"     ->      5
            "Xe"    ->      5
            "Cs"    ->      6
            "Ba"    ->      6
            "La"    ->      6
            "Ce"    ->      6
            "Pr"    ->      6
            "Nd"    ->      6
            "Pm"    ->      6
            "Sm"    ->      6
            "Eu"    ->      6
            "Gd"    ->      6
            "Tb"    ->      6
            "Dy"    ->      6
            "Ho"    ->      6
            "Er"    ->      6
            "Tm"    ->      6
            "Yb"    ->      6
            "Lu"    ->      6
            "Hf"    ->      6
            "Ta"    ->      6
            "W"     ->      6
            "Re"    ->      6
            "Os"    ->      6
            "Ir"    ->      6
            "Pt"    ->      6
            "Au"    ->      6
            "Hg"    ->      6
            "Tl"    ->      6
            "Pb"    ->      6
            "Bi"    ->      6
            "Po"    ->      6
            "At"    ->      6
            "Rn"    ->      6
            "Fr"    ->      7
            "Ra"    ->      7
            "Ac"    ->      7
            "Th"    ->      7
            "Pa"    ->      7
            "U"     ->      7
            "Np"    ->      7
            "Pu"    ->      7
            "Am"    ->      7
            "Cm"    ->      7
            "Bk"    ->      7
            "Cf"    ->      7
            "Es"    ->      7
            "Fm"    ->      7
            "Md"    ->      7
            "No"    ->      7
            "Lr"    ->      7
            "Rf"    ->      7
            "Db"    ->      7
            "Sg"    ->      7
            "Bh"    ->      7
            "Hs"    ->      7
            "Mt"    ->      7
            "Ds"    ->      7
            "Rg"    ->      7
            "Cn"    ->      7
            "Nh"    ->      7
            "Fl"    ->      7
            "Mc"    ->      7
            "Lv"    ->      7
            "Ts"    ->      7
            "Og"    ->      7
            else    ->      0
        }
    }

    fun radioattivo(name: String): Boolean {
        return when (name) {
            "H"     ->      false
            "He"    ->      false
            "Li"    ->      false
            "Be"    ->      false
            "B"     ->      false
            "C"     ->      false
            "N"     ->      false
            "O"     ->      false
            "F"     ->      false
            "Ne"    ->      false
            "Na"    ->      false
            "Mg"    ->      false
            "Al"    ->      false
            "Si"    ->      false
            "P"     ->      false
            "S"     ->      false
            "Cl"    ->      false
            "Ar"    ->      false
            "K"     ->      false
            "Ca"    ->      false
            "Sc"    ->      false
            "Ti"    ->      false
            "V"     ->      false
            "Cr"    ->      false
            "Mn"    ->      false
            "Fe"    ->      false
            "Co"    ->      false
            "Ni"    ->      false
            "Cu"    ->      false
            "Zn"    ->      false
            "Ga"    ->      false
            "Ge"    ->      false
            "As"    ->      false
            "Se"    ->      false
            "Br"    ->      false
            "Kr"    ->      false
            "Rb"    ->      false
            "Sr"    ->      false
            "Y"     ->      false
            "Zr"    ->      false
            "Nb"    ->      false
            "Mo"    ->      false
            "Tc"    ->      true
            "Ru"    ->      false
            "Rh"    ->      false
            "Pd"    ->      false
            "Ag"    ->      false
            "Cd"    ->      false
            "In"    ->      false
            "Sn"    ->      false
            "Sb"    ->      false
            "Te"    ->      false
            "I"     ->      false
            "Xe"    ->      false
            "Cs"    ->      false
            "Ba"    ->      false
            "La"    ->      false
            "Ce"    ->      false
            "Pr"    ->      false
            "Nd"    ->      false
            "Pm"    ->      true
            "Sm"    ->      false
            "Eu"    ->      false
            "Gd"    ->      false
            "Tb"    ->      false
            "Dy"    ->      false
            "Ho"    ->      false
            "Er"    ->      false
            "Tm"    ->      false
            "Yb"    ->      false
            "Lu"    ->      false
            "Hf"    ->      false
            "Ta"    ->      false
            "W"     ->      false
            "Re"    ->      false
            "Os"    ->      false
            "Ir"    ->      false
            "Pt"    ->      false
            "Au"    ->      false
            "Hg"    ->      false
            "Tl"    ->      false
            "Pb"    ->      false
            "Bi"    ->      true
            "Po"    ->      true
            "At"    ->      true
            "Rn"    ->      true
            "Fr"    ->      true
            "Ra"    ->      true
            "Ac"    ->      true
            "Th"    ->      true
            "Pa"    ->      true
            "U"     ->      true
            "Np"    ->      true
            "Pu"    ->      true
            "Am"    ->      true
            "Cm"    ->      true
            "Bk"    ->      true
            "Cf"    ->      true
            "Es"    ->      true
            "Fm"    ->      true
            "Md"    ->      true
            "No"    ->      true
            "Lr"    ->      true
            "Rf"    ->      true
            "Db"    ->      true
            "Sg"    ->      true
            "Bh"    ->      true
            "Hs"    ->      true
            "Mt"    ->      true
            "Ds"    ->      true
            "Rg"    ->      true
            "Cn"    ->      true
            "Nh"    ->      true
            "Fl"    ->      true
            "Mc"    ->      true
            "Lv"    ->      true
            "Ts"    ->      true
            "Og"    ->      true
            else    ->      false
        }
    }

    fun densità(name: String): Double {
        return when (name) {
            "H"     ->      0.0899
            "He"    ->      0.18
            "Li"    ->      530.0
            "Be"    ->      1850.0
            "B"     ->      2470.0
            "C"     ->      2260.0
            "N"     ->      1.25
            "O"     ->      1.43
            "F"     ->      1.7
            "Ne"    ->      0.9
            "Na"    ->      970.0
            "Mg"    ->      1740.0
            "Al"    ->      2700.0
            "Si"    ->      2330.0
            "P"     ->      1820.0
            "S"     ->      2090.0
            "Cl"    ->      3.21
            "Ar"    ->      1.78
            "K"     ->      860.0
            "Ca"    ->      1530.0
            "Sc"    ->      2990.0
            "Ti"    ->      4550.0
            "V"     ->      6110.0
            "Cr"    ->      7190.0
            "Mn"    ->      7430.0
            "Fe"    ->      7860.0
            "Co"    ->      8800.0
            "Ni"    ->      8900.0
            "Cu"    ->      8960.0
            "Zn"    ->      7140.0
            "Ga"    ->      5910.0
            "Ge"    ->      5320.0
            "As"    ->      5730.0
            "Se"    ->      4810.0
            "Br"    ->      3120.0
            "Kr"    ->      3.75
            "Rb"    ->      1530.0
            "Sr"    ->      2600.0
            "Y"     ->      4470.0
            "Zr"    ->      6490.0
            "Nb"    ->      8570.0
            "Mo"    ->      10200.0
            "Tc"    ->      11500.0
            "Ru"    ->      12500.0
            "Rh"    ->      12400.0
            "Pd"    ->      12000.0
            "Ag"    ->      10500.0
            "Cd"    ->      8650.0
            "In"    ->      7310.0
            "Sn"    ->      7290.0
            "Sb"    ->      6680.0
            "Te"    ->      6240.0
            "I"     ->      4930.0
            "Xe"    ->      5.9
            "Cs"    ->      1870.0
            "Ba"    ->      3590.0
            "La"    ->      6170.0
            "Ce"    ->      6770.0
            "Pr"    ->      6770.0
            "Nd"    ->      7000.0
            "Pm"    ->      7220.0
            "Sm"    ->      7540.0
            "Eu"    ->      5240.0
            "Gd"    ->      7890.0
            "Tb"    ->      8270.0
            "Dy"    ->      8530.0
            "Ho"    ->      8800.0
            "Er"    ->      9050.0
            "Tm"    ->      9330.0
            "Yb"    ->      6980.0
            "Lu"    ->      9840.0
            "Hf"    ->      13300.0
            "Ta"    ->      16700.0
            "W"     ->      19300.0
            "Re"    ->      21000.0
            "Os"    ->      22600.0
            "Ir"    ->      22500.0
            "Pt"    ->      21400.0
            "Au"    ->      19300.0
            "Hg"    ->      13600.0
            "Tl"    ->      11800.0
            "Pb"    ->      11400.0
            "Bi"    ->      9800.0
            "Po"    ->      9200.0
            "At"    ->      0.0
            "Rn"    ->      9.72
            "Fr"    ->      1000.0
            "Ra"    ->      5000.0
            "Ac"    ->      10100.0
            "Th"    ->      11700.0
            "Pa"    ->      15400.0
            "U"     ->      19000.0
            "Np"    ->      20400.0
            "Pu"    ->      19700.0
            "Am"    ->      13700.0
            "Cm"    ->      13500.0
            "Bk"    ->      14800.0
            "Cf"    ->      0.0
            "Es"    ->      15100.0
            "Fm"    ->      0.0
            "Md"    ->      0.0
            "No"    ->      0.0
            "Lr"    ->      0.0
            "Rf"    ->      0.0
            "Db"    ->      0.0
            "Sg"    ->      0.0
            "Bh"    ->      0.0
            "Hs"    ->      0.0
            "Mt"    ->      0.0
            "Ds"    ->      0.0
            "Rg"    ->      0.0
            "Cn"    ->      0.0
            "Nh"    ->      0.0
            "Fl"    ->      0.0
            "Mc"    ->      0.0
            "Lv"    ->      0.0
            "Ts"    ->      0.0
            "Og"    ->      0.0
            else    ->      0.0
        }
    }

    fun neutroni(name: String): Int {
        return when (name) {
            "H"     ->      0
            "He"    ->      2
            "Li"    ->      4
            "Be"    ->      5
            "B"     ->      6
            "C"     ->      6
            "N"     ->      7
            "O"     ->      8
            "F"     ->      10
            "Ne"    ->      10
            "Na"    ->      12
            "Mg"    ->      12
            "Al"    ->      14
            "Si"    ->      14
            "P"     ->      16
            "S"     ->      16
            "Cl"    ->      18
            "Ar"    ->      22
            "K"     ->      20
            "Ca"    ->      20
            "Sc"    ->      24
            "Ti"    ->      26
            "V"     ->      28
            "Cr"    ->      28
            "Mn"    ->      30
            "Fe"    ->      30
            "Co"    ->      32
            "Ni"    ->      31
            "Cu"    ->      35
            "Zn"    ->      35
            "Ga"    ->      39
            "Ge"    ->      41
            "As"    ->      42
            "Se"    ->      45
            "Br"    ->      45
            "Kr"    ->      48
            "Rb"    ->      48
            "Sr"    ->      50
            "Y"     ->      50
            "Zr"    ->      51
            "Nb"    ->      52
            "Mo"    ->      54
            "Tc"    ->      55
            "Ru"    ->      57
            "Rh"    ->      57
            "Pd"    ->      60
            "Ag"    ->      61
            "Cd"    ->      64
            "In"    ->      66
            "Sn"    ->      69
            "Sb"    ->      71
            "Te"    ->      75
            "I"     ->      74
            "Xe"    ->      77
            "Cs"    ->      78
            "Ba"    ->      81
            "La"    ->      82
            "Ce"    ->      82
            "Pr"    ->      82
            "Nd"    ->      84
            "Pm"    ->      84
            "Sm"    ->      88
            "Eu"    ->      89
            "Gd"    ->      93
            "Tb"    ->      94
            "Dy"    ->      96
            "Ho"    ->      98
            "Er"    ->      99
            "Tm"    ->      100
            "Yb"    ->      103
            "Lu"    ->      104
            "Hf"    ->      106
            "Ta"    ->      108
            "W"     ->      110
            "Re"    ->      111
            "Os"    ->      114
            "Ir"    ->      115
            "Pt"    ->      117
            "Au"    ->      118
            "Hg"    ->      120
            "Tl"    ->      123
            "Pb"    ->      125
            "Bi"    ->      126
            "Po"    ->      125
            "At"    ->      125
            "Rn"    ->      136
            "Fr"    ->      136
            "Ra"    ->      138
            "Ac"    ->      138
            "Th"    ->      142
            "Pa"    ->      140
            "U"     ->      146
            "Np"    ->      144
            "Pu"    ->      150
            "Am"    ->      148
            "Cm"    ->      151
            "Bk"    ->      150
            "Cf"    ->      153
            "Es"    ->      153
            "Fm"    ->      157
            "Md"    ->      157
            "No"    ->      157
            "Lr"    ->      163
            "Rf"    ->      157
            "Db"    ->      157
            "Sg"    ->      163
            "Bh"    ->      160
            "Hs"    ->      161
            "Mt"    ->      169
            "Ds"    ->      171
            "Rg"    ->      171
            "Cn"    ->      173
            "Nh"    ->      173
            "Fl"    ->      175
            "Mc"    ->      173
            "Lv"    ->      177
            "Ts"    ->      177
            "Og"    ->      176
            else    ->      0
        }
    }

    fun raggio(name: String): Int {
        return when (name) {
            "H"     ->      30
            "He"    ->      93
            "Li"    ->      155
            "Be"    ->      112
            "B"     ->      98
            "C"     ->      91
            "N"     ->      92
            "O"     ->      66
            "F"     ->      64
            "Ne"    ->      160
            "Na"    ->      190
            "Mg"    ->      160
            "Al"    ->      143
            "Si"    ->      132
            "P"     ->      128
            "S"     ->      104
            "Cl"    ->      99
            "Ar"    ->      191
            "K"     ->      235
            "Ca"    ->      197
            "Sc"    ->      160
            "Ti"    ->      146
            "V"     ->      134
            "Cr"    ->      127
            "Mn"    ->      126
            "Fe"    ->      126
            "Co"    ->      125
            "Ni"    ->      124
            "Cu"    ->      128
            "Zn"    ->      133
            "Ga"    ->      141
            "Ge"    ->      137
            "As"    ->      139
            "Se"    ->      140
            "Br"    ->      114
            "Kr"    ->      200
            "Rb"    ->      248
            "Sr"    ->      215
            "Y"     ->      179
            "Zr"    ->      160
            "Nb"    ->      146
            "Mo"    ->      139
            "Tc"    ->      136
            "Ru"    ->      133
            "Rh"    ->      134
            "Pd"    ->      138
            "Ag"    ->      144
            "Cd"    ->      154
            "In"    ->      166
            "Sn"    ->      162
            "Sb"    ->      159
            "Te"    ->      160
            "I"     ->      133
            "Xe"    ->      220
            "Cs"    ->      267
            "Ba"    ->      222
            "La"    ->      187
            "Ce"    ->      161
            "Pr"    ->      182
            "Nd"    ->      182
            "Pm"    ->      0
            "Sm"    ->      166
            "Eu"    ->      204
            "Gd"    ->      179
            "Tb"    ->      177
            "Dy"    ->      177
            "Ho"    ->      176
            "Er"    ->      175
            "Tm"    ->      174
            "Yb"    ->      192
            "Lu"    ->      158
            "Hf"    ->      158
            "Ta"    ->      146
            "W"     ->      139
            "Re"    ->      137
            "Os"    ->      134
            "Ir"    ->      136
            "Pt"    ->      138
            "Au"    ->      144
            "Hg"    ->      157
            "Tl"    ->      171
            "Pb"    ->      175
            "Bi"    ->      170
            "Po"    ->      176
            "At"    ->      140
            "Rn"    ->      250
            "Fr"    ->      272
            "Ra"    ->      220
            "Ac"    ->      188
            "Th"    ->      0
            "Pa"    ->      161
            "U"     ->      0
            "Np"    ->      0
            "Pu"    ->      0
            "Am"    ->      0
            "Cm"    ->      0
            "Bk"    ->      0
            "Cf"    ->      0
            "Es"    ->      0
            "Fm"    ->      0
            "Md"    ->      0
            "No"    ->      0
            "Lr"    ->      0
            "Rf"    ->      0
            "Db"    ->      0
            "Sg"    ->      0
            "Bh"    ->      0
            "Hs"    ->      0
            "Mt"    ->      0
            "Ds"    ->      0
            "Rg"    ->      0
            "Cn"    ->      0
            "Nh"    ->      0
            "Fl"    ->      0
            "Mc"    ->      0
            "Lv"    ->      0
            "Ts"    ->      0
            "Og"    ->      0
            else    ->      0
        }
    }

    fun nEngElem(name: String): String {
        return when (name) {
            "H"     ->      "Hydrogen"
            "He"    ->      "Helium"
            "Li"    ->      "Lithium"
            "Be"    ->      "Beryllium"
            "B"     ->      "Boron"
            "C"     ->      "Carbon"
            "N"     ->      "Nitrogen"
            "O"     ->      "Oxygen"
            "F"     ->      "Fluorine"
            "Ne"    ->      "Neon"
            "Na"    ->      "Sodium"
            "Mg"    ->      "Magnesium"
            "Al"    ->      "Aluminum"
            "Si"    ->      "Silicon"
            "P"     ->      "Phosphorus"
            "S"     ->      "Sulfur"
            "Cl"    ->      "Chlorine"
            "Ar"    ->      "Argon"
            "K"     ->      "Potassium"
            "Ca"    ->      "Calcium"
            "Sc"    ->      "Scandium"
            "Ti"    ->      "Titanium"
            "V"     ->      "Vanadium"
            "Cr"    ->      "Chromium"
            "Mn"    ->      "Manganese"
            "Fe"    ->      "Iron"
            "Co"    ->      "Cobalt"
            "Ni"    ->      "Nickel"
            "Cu"    ->      "Copper"
            "Zn"    ->      "Zinc"
            "Ga"    ->      "Gallium"
            "Ge"    ->      "Germanium"
            "As"    ->      "Arsenic"
            "Se"    ->      "Selenium"
            "Br"    ->      "Bromine"
            "Kr"    ->      "Krypton"
            "Rb"    ->      "Rubidium"
            "Sr"    ->      "Strontium"
            "Y"     ->      "Yttrium"
            "Zr"    ->      "Zirconium"
            "Nb"    ->      "Niobium"
            "Mo"    ->      "Molybdenum"
            "Tc"    ->      "Technetium"
            "Ru"    ->      "Ruthenium"
            "Rh"    ->      "Rhodium"
            "Pd"    ->      "Palladium"
            "Ag"    ->      "Silver"
            "Cd"    ->      "Cadmium"
            "In"    ->      "Indium"
            "Sn"    ->      "Tin"
            "Sb"    ->      "Antimony"
            "Te"    ->      "Tellurium"
            "I"     ->      "Iodine"
            "Xe"    ->      "Xenon"
            "Cs"    ->      "Cesium"
            "Ba"    ->      "Barium"
            "La"    ->      "Lanthanum"
            "Ce"    ->      "Cerium"
            "Pr"    ->      "Praseodymium"
            "Nd"    ->      "Neodymium"
            "Pm"    ->      "Promethium"
            "Sm"    ->      "Samarium"
            "Eu"    ->      "Europium"
            "Gd"    ->      "Gadolinium"
            "Tb"    ->      "Terbium"
            "Dy"    ->      "Dysprosium"
            "Ho"    ->      "Holmium"
            "Er"    ->      "Erbium"
            "Tm"    ->      "Thullum"
            "Yb"    ->      "Ytterbium"
            "Lu"    ->      "Lutetium"
            "Hf"    ->      "Hafnium"
            "Ta"    ->      "Tantalum"
            "W"     ->      "Tungsten"
            "Re"    ->      "Rhenium"
            "Os"    ->      "Osmium"
            "Ir"    ->      "Iridium"
            "Pt"    ->      "Platinum"
            "Au"    ->      "Gold"
            "Hg"    ->      "Mercury"
            "Tl"    ->      "Thallium"
            "Pb"    ->      "Lead"
            "Bi"    ->      "Bismuth"
            "Po"    ->      "Polonium"
            "At"    ->      "Astatine"
            "Rn"    ->      "Radon"
            "Fr"    ->      "Francium"
            "Ra"    ->      "Radium"
            "Ac"    ->      "Actinium"
            "Th"    ->      "Thorium"
            "Pa"    ->      "Protactinium"
            "U"     ->      "Uranium"
            "Np"    ->      "Neptunium"
            "Pu"    ->      "Plutonium"
            "Am"    ->      "Americium"
            "Cm"    ->      "Curium"
            "Bk"    ->      "Berkelium"
            "Cf"    ->      "Californium"
            "Es"    ->      "Einsteinium"
            "Fm"    ->      "Fermium"
            "Md"    ->      "Mendelevium"
            "No"    ->      "Nobelium"
            "Lr"    ->      "Lawrencium"
            "Rf"    ->      "Rutherfordium"
            "Db"    ->      "Dubnium"
            "Sg"    ->      "Seaborgium"
            "Bh"    ->      "Bohrium"
            "Hs"    ->      "Hassium"
            "Mt"    ->      "Meitnerium"
            "Ds"    ->      "Darmstadtium"
            "Rg"    ->      "Roentgenium"
            "Cn"    ->      "Copernicium"
            "Nh"    ->      "Nihonium"
            "Fl"    ->      "Flerovium"
            "Mc"    ->      "Moscovium"
            "Lv"    ->      "Livermorium"
            "Ts"    ->      "Tennessine"
            "Og"    ->      "Oganesson"
            else    ->      ""
        }
    }

    fun classeEng(name: String): String {
        return when (name) {
            "H"     ->      "Non-metals"
            "He"    ->      "Noble gases"
            "Li"    ->      "Alkali metals"
            "Be"    ->      "Alkaline earth metals"
            "B"     ->      "Semimetals"
            "C"     ->      "Non-metals"
            "N"     ->      "Non-metals"
            "O"     ->      "Non-metals"
            "F"     ->      "Halogens"
            "Ne"    ->      "Noble gases"
            "Na"    ->      "Alkali metals"
            "Mg"    ->      "Alkaline earth metals"
            "Al"    ->      "P-block metals"
            "Si"    ->      "Semimetals"
            "P"     ->      "Non-metals"
            "S"     ->      "Non-metals"
            "Cl"    ->      "Halogens"
            "Ar"    ->      "Noble gases"
            "K"     ->      "Alkali metals"
            "Ca"    ->      "Alkaline earth metals"
            "Sc"    ->      "D-block metals"
            "Ti"    ->      "D-block metals"
            "V"     ->      "D-block metals"
            "Cr"    ->      "D-block metals"
            "Mn"    ->      "D-block metals"
            "Fe"    ->      "D-block metals"
            "Co"    ->      "D-block metals"
            "Ni"    ->      "D-block metals"
            "Cu"    ->      "D-block metals"
            "Zn"    ->      "D-block metals"
            "Ga"    ->      "P-block metals"
            "Ge"    ->      "Semimetals"
            "As"    ->      "Semimetals"
            "Se"    ->      "Non-metals"
            "Br"    ->      "Halogens"
            "Kr"    ->      "Noble gases"
            "Rb"    ->      "Alkali metals"
            "Sr"    ->      "Alkaline earth metals"
            "Y"     ->      "D-block metals"
            "Zr"    ->      "D-block metals"
            "Nb"    ->      "D-block metals"
            "Mo"    ->      "D-block metals"
            "Tc"    ->      "D-block metals"
            "Ru"    ->      "D-block metals"
            "Rh"    ->      "D-block metals"
            "Pd"    ->      "D-block metals"
            "Ag"    ->      "D-block metals"
            "Cd"    ->      "D-block metals"
            "In"    ->      "P-block metals"
            "Sn"    ->      "P-block metals"
            "Sb"    ->      "Semimetals"
            "Te"    ->      "Semimetals"
            "I"     ->      "Halogens"
            "Xe"    ->      "Noble gases"
            "Cs"    ->      "Alkali metals"
            "Ba"    ->      "Alkaline earth metals"
            "La"    ->      "Lanthanoids"
            "Ce"    ->      "Lanthanoids"
            "Pr"    ->      "Lanthanoids"
            "Nd"    ->      "Lanthanoids"
            "Pm"    ->      "Lanthanoids"
            "Sm"    ->      "Lanthanoids"
            "Eu"    ->      "Lanthanoids"
            "Gd"    ->      "Lanthanoids"
            "Tb"    ->      "Lanthanoids"
            "Dy"    ->      "Lanthanoids"
            "Ho"    ->      "Lanthanoids"
            "Er"    ->      "Lanthanoids"
            "Tm"    ->      "Lanthanoids"
            "Yb"    ->      "Lanthanoids"
            "Lu"    ->      "Lanthanoids"
            "Hf"    ->      "D-block metals"
            "Ta"    ->      "D-block metals"
            "W"     ->      "D-block metals"
            "Re"    ->      "D-block metals"
            "Os"    ->      "D-block metals"
            "Ir"    ->      "D-block metals"
            "Pt"    ->      "D-block metals"
            "Au"    ->      "D-block metals"
            "Hg"    ->      "D-block metals"
            "Tl"    ->      "P-block metals"
            "Pb"    ->      "P-block metals"
            "Bi"    ->      "P-block metals"
            "Po"    ->      "Semimetals"
            "At"    ->      "Halogens"
            "Rn"    ->      "Noble gases"
            "Fr"    ->      "Alkali metals"
            "Ra"    ->      "Alkaline earth metals"
            "Ac"    ->      "Actinoids"
            "Th"    ->      "Actinoids"
            "Pa"    ->      "Actinoids"
            "U"     ->      "Actinoids"
            "Np"    ->      "Actinoids"
            "Pu"    ->      "Actinoids"
            "Am"    ->      "Actinoids"
            "Cm"    ->      "Actinoids"
            "Bk"    ->      "Actinoids"
            "Cf"    ->      "Actinoids"
            "Es"    ->      "Actinoids"
            "Fm"    ->      "Actinoids"
            "Md"    ->      "Actinoids"
            "No"    ->      "Actinoids"
            "Lr"    ->      "Actinoids"
            "Rf"    ->      "D-block metals"
            "Db"    ->      "D-block metals"
            "Sg"    ->      "D-block metals"
            "Bh"    ->      "D-block metals"
            "Hs"    ->      "D-block metals"
            "Mt"    ->      "D-block metals"
            "Ds"    ->      "D-block metals"
            "Rg"    ->      "D-block metals"
            "Cn"    ->      "D-block metals"
            "Nh"    ->      "P-block metals"
            "Fl"    ->      "P-block metals"
            "Mc"    ->      "P-block metals"
            "Lv"    ->      "P-block metals"
            "Ts"    ->      "Halogens"
            "Og"    ->      "Noble gases"
            else    ->      ""
        }
    }

    fun isotopiIta(name: String): Array<Array<String>> {
        return when (name) {
            "H"     ->  arrayOf(arrayOf("¹H", "99.985%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²H", "0.015%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³H", "Tracce", "12,33 anni", "β⁻", "0,019", "³He"), arrayOf("⁴H", "Sintetico", "(1,39 ± 0,10) x 10⁻²²", "n, γ", "2,910", "³H - ⁴He"))
            "He"    ->  arrayOf(arrayOf("³He", "1.37 ppm", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴He", "99.999863%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶He", "Sintetico", "806,7 ms", "β⁻", "3,508", "⁶Li"))
            "Li"    ->  arrayOf(arrayOf("⁶Li", "7,5%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷Li", "92.5%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷Li", "Sintetico", "836 ms", "β⁺, β⁻, α", "16,004", "⁸Be"))
            "Be"    ->  arrayOf(arrayOf("⁷Be", "Sintetico", "53,12 giorni", "ε", "0.862", "⁷Li"), arrayOf("⁹Be", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰Be", "Tracce", "1,51 x 10⁶ anni", "β⁻", "0,556", "¹⁰B"))
            "B"     ->  arrayOf(arrayOf("¹⁰B", "19,9%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹B", "80,1%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "C"     ->  arrayOf(arrayOf("¹²C", "98,89%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³C", "1,11%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴C", "Tracce", "5570 anni", "β⁻", "0,156", "¹⁴N"))
            "N"     ->  arrayOf(arrayOf("¹³N", "Sintetico", "9,965 minuti", "ε", "2,220", "¹³C"), arrayOf("¹⁴N", "99,634%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵N", "0,366%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "O"     ->  arrayOf(arrayOf("¹⁶O", "99,762%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷O", "0,038%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸O", "0,2%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "F"     ->  arrayOf(arrayOf("¹⁹F", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ne"    ->  arrayOf(arrayOf("²⁰Ne", "90,48%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²¹Ne", "0,27%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²²Ne", "9,25%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Na"    ->  arrayOf(arrayOf("²²Na", "Sintetico", "2,6020 anni", "ε", "2,842", "²²Ne"), arrayOf("²³Na", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Mg"    ->  arrayOf(arrayOf("²⁴Mg", "78,99%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁵Mg", "10%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁶Mg", "11,01%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Al"    ->  arrayOf(arrayOf("²⁶Al", "Tracce", "7,17 x 10⁵ anni", "β⁺, ε", "4,004", "²⁶Mg"), arrayOf("²⁷Al", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Si"    ->  arrayOf(arrayOf("²⁸Si", "92,23%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁹Si", "4,67%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³⁰Si", "3,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³²Si", "Sintetico", "276 anni", "β⁻", "0,224", "³²P"))
            "P"     ->  arrayOf(arrayOf("³¹P", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³²P", "Sintetico", "14,3 giorni", "β", "1,71", "³²S"), arrayOf("³³P", "Sintetico", "25,4 giorni", "β", "0,25", "³³S"))
            "S"     ->  arrayOf(arrayOf("³²S", "95,02%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³³S", "0,75%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³⁴S", "4,21%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³⁵S", "Sintetico", "87,32 giorni", "β⁻", "0,167", "³⁵Cl"), arrayOf("³⁶S", "0,02%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Cl"    ->  arrayOf(arrayOf("³¹Cl", "75,77%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³¹Cl", "Sintetico", "301000 anni", "β⁻, ε", "0,709 - 1,142", "³⁶Ar - ³⁶S"), arrayOf("³¹Cl", "24,23%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ar"    ->  arrayOf(arrayOf("³⁶Ar", "0,336%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³⁷Ar", "Sintetico", "35 giorni", "ε", "0,813", "³⁷Cl"), arrayOf("³⁸Ar", "0,063%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("³⁹Ar", "Sintetico", "269 anni", "β⁻", "0,565", "³⁹K"), arrayOf("⁴⁰Ar", "99,600%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴²Ar", "Sintetico", "32,9 anni", "β⁻", "0,600", "⁴²K"))
            "K"     ->  arrayOf(arrayOf("³⁹K", "93,26%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁰K", "0,01%", "1,277x 10⁹ anni", "β⁻, ε", "1,311 - 1,505", "⁴⁰Ca - ⁴⁰Ar"), arrayOf("⁴¹K", "6,73%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ca"    ->  arrayOf(arrayOf("⁴⁰Ca", "96,941%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴¹Ca", "Sintetico", "103000 anni", "ε", "0,421", "⁴¹K"), arrayOf("⁴²Ca", "0,647%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴³Ca", "0,135%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁴Ca", "2,086%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁶Ca", "0,004%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁸Ca", "0,187%", "4,2 x 10¹⁹ anni", "ββ⁻", "4,272", "⁴⁸Ti"))
            "Sc"    ->  arrayOf(arrayOf("⁴⁵Sc", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁶Sc", "Sintetico", "38,79 giorni", "β⁻", "2,367", "⁴⁶Ti"))
            "Ti"    ->  arrayOf(arrayOf("⁴⁴Ti", "Sintetico", "63 anni", "s", "0,268", "⁴⁴Sc"), arrayOf("⁴⁶Ti", "8,0%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁷Ti", "7,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁸Ti", "73,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁴⁹Ti", "5,5%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁰Ti", "5,4%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "V"     ->  arrayOf(arrayOf("⁴⁸V", "Sintetico", "15,9735 giorni", "ε", "4,012", "⁴⁸Ti"), arrayOf("⁴⁹V", "Sintetico", "330 giorni", "ε", "0,602", "⁴⁹Ti"), arrayOf("⁵⁰V", "0,25%", "1,4 x 10¹⁷ anni", "ε, β", "2,208 - 1,037", "⁵⁰Ti - ⁵⁰Cr"), arrayOf("⁵⁰Ti", "99,75%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Cr"    ->  arrayOf(arrayOf("⁵⁰Cr", "4,345%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵¹Cr", "Sintetico", "27,7025 giorni", "ε", "0,753", "⁵¹V"), arrayOf("⁵²Cr", "83,789%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵³Cr", "9,501%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁴Cr", "2,365%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Mn"    ->  arrayOf(arrayOf("⁵²Mn", "Sintetico", "5,591 giorni", "ε", "4,712", "⁵²Cr"), arrayOf("⁵³Mn", "Sintetico", "3,74 milioni di anni", "ε", "0,597", "⁵³Cr"), arrayOf("⁵⁴Mn", "Sintetico", "27,7025", "ε, β⁻", "1,377 - 0,697", "⁵⁴Cr - ⁵⁴Fe"), arrayOf("⁵⁵Mn", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Fe"    ->  arrayOf(arrayOf("⁵⁴Fe", "5,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁵Fe", "Sintetico", "2,73 anni", "ε", "0,231", "⁵⁵Mn"), arrayOf("⁵⁶Fe", "91,72%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁷Fe", "2,2%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁸Fe", "0,28%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁹Fe", "Sintetico", "44,503 giorni", "β⁻", "1,565", "⁵⁹Co"), arrayOf("⁶⁰Fe", "Sintetico", "2,6 x 106 anni", "β⁻", "3,978", "⁶⁰Co"))
            "Co"    ->  arrayOf(arrayOf("⁵⁶Co", "Sintetico", "77,27 giorni", "ε", "4,566", "⁵⁶Fe"), arrayOf("⁵⁷Co", "Sintetico", "721,79 giorni", "ε", "0,836", "⁵⁷Fe"), arrayOf("⁵⁸Co", "Sintetico", "70,86 giorni", "ε", "2,307", "⁵⁸Fe"), arrayOf("⁵⁹Co", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶⁰Co", "Sintetico", "5,2714 anni", "β⁻", "2,824", "⁶⁰Ni"))
            "Ni"    ->  arrayOf(arrayOf("⁵⁶Ni", "Sintetico", "6,077 giorni", "ε", "2,136", "⁵⁶Co"), arrayOf("⁵⁸Ni", "68,077%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁵⁹Ni", "Sintetico", "76000 anni", "ε", "1,702", "⁵⁹Co"), arrayOf("⁶⁰Ni", "26,233%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶¹Ni", "1,1399%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶²Ni", "3,6346%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶³Ni", "Sintetico", "100,1 anni", "β⁻", "2,137", "⁶³Cu"), arrayOf("⁶⁴Ni", "0,9255%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Cu"    ->  arrayOf(arrayOf("⁶³Cu", "69,17%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶⁴Cu", "Sintetico", "12,7 ore", "ε, β⁻", "1,675 - 0,579", "⁶⁴Ni - ⁶⁴Zn"), arrayOf("⁶⁵Ni", "30,83%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Zn"    ->  arrayOf(arrayOf("⁶⁴Zn", "48,6%", ">2,3 x 10¹⁸ anni", "β⁺β⁺", "1,096", "⁶⁴Ni"), arrayOf("⁶⁵Zn", "Sintetico", "244,26 giorni", "ε", "1,352", "⁶⁵Cu"), arrayOf("⁶⁶Zn", "27,9%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶⁷Zn", "4,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁶⁸Zn", "18,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁰Zn", "0,6%", ">1,3 x 10¹⁶ anni", "β⁻β⁻", "0,998", "⁷⁰Ge"), arrayOf("⁷²Zn", "Sintetico", "46,5 ore", "β", "0,458", "⁷²Ga"))
            "Ga"    ->  arrayOf(arrayOf("⁶⁹Ga", "60,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷¹Ga", "39,9%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ge"    ->  arrayOf(arrayOf("⁷⁰Ge", "20,52%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷²Ge", "27,45%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷³Ge", "7,76%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁴Ge", "36,52%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁶Ge", "7,75", "1,78 x 10^²¹ anni", "Sconosciuto", "Sconosciuto", "Sconosciuto"))
            "As"    ->  arrayOf(arrayOf("⁷⁵As", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Se"    ->  arrayOf(arrayOf("⁷²Se", "Sintetico", "8,4 giorni", "ε", "0,335", "⁷²As"), arrayOf("⁷⁴Se", "0,87%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁵Se", "Sintetico", "119,779 giorni", "ε", "0,864", "⁷⁵As"), arrayOf("⁷⁶Se", "9.36%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁷Se", "7,63%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁸Se", "23,78", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁷⁹Se", "Sintetico", "1,13 x 10⁶ anni", "β", "0,151", "⁷⁹Br"), arrayOf("⁸⁰Se", "49,61%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸²Se", "8,73%", "1,08 x 10²⁰ anni", "2β", "2,995", "⁸²Kr"))
            "Br"    ->  arrayOf(arrayOf("⁷⁹Br", "50,69%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸¹Br", "49,31%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Kr"    ->  arrayOf(arrayOf("⁷⁸Kr", "0,35%", "2,3 x 10²⁰ anni", "εε", "Sconosciuto", "⁷⁸Se"), arrayOf("⁷⁹Kr", "Sintetico", "35,04 ore", "ε, β⁺, γ", "Sconosciuto - 0,604 - 0,26 - 0,39", "⁷⁹Br - ⁷⁹Br"), arrayOf("⁸⁰Kr", "2,25%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸¹Kr", "Sintetico", "229000 anni", "ε, γ", "Sconosciuto - 0,281", "⁸¹Br - Sconosciuto"), arrayOf("⁸²Kr", "11,6%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸³Kr", "11,5%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁴Kr", "57%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁵Kr", "Sintetico", "10,756 anni", "β", "0,687", "⁸⁵Rb"), arrayOf("⁸⁶Kr", "17,3%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Rb"    ->  arrayOf(arrayOf("⁸⁵Rb", "72,168%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁷Rb", "27,835%", "4,88 x 10¹⁰ anni", "β⁻", "0,283", "⁸⁷Sr"))
            "Sr"    ->  arrayOf(arrayOf("⁸⁴Sr", "0,56%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁶Sr", "9,86%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁷Sr", "7,0%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁸⁸Sr", "82,58%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁰Sr", "Sintetico", "28,78 anni", "β⁻", "0,546", "⁹⁰Y"))
            "Y"     ->  arrayOf(arrayOf("⁸⁹Y", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁰Y", "Sintetico", "2,67 giorni", "β⁻", "2,284", "⁹⁰Zr"))
            "Zr"    ->  arrayOf(arrayOf("⁹⁰Zr", "51,45%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹¹Zr", "11,22%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹²Zr", "17,15%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹³Zr", "Sintetico", "1,53 x 10⁶ anni", "β⁻", "0,091", "⁹³Nb"), arrayOf("⁹⁴Zr", "17,38%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁶Zr", "2,8%", "3,8 x 10¹⁹ anni", "β⁻", "3,350", "⁹⁶Mo"))
            "Nb"    ->  arrayOf(arrayOf("⁹¹Nb", "Sintetico", "680 anni", "ε", "1,253", "⁹¹Zr"), arrayOf("⁹²Nb", "Sintetico", "3,47 x 10⁷ anni", "β⁻, ε", "0,356 - 2,006", "⁹²Mo - ⁹²Zr"), arrayOf("⁹³Nb", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁴Nb", "Sintetico", "20300 anni", "β⁻", "2,045", "⁹⁴Mo"))
            "Mo"    ->  arrayOf(arrayOf("⁹²Mo", "14,84%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹³Mo", "Sintetico", "4000 anni", "ε", "0,405", "⁹³Nb"), arrayOf("⁹⁴Mo", "9,25%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁵Mo", "15,92%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁶Mo", "16,68%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁷Mo", "9,55%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁸Mo", "24,13%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁹Mo", "Sintetico", "65,94 ore", "β", "1,357", "⁹⁹Tc"), arrayOf("¹⁰⁰Mo", "9,63%", "7,8 x 10¹⁸ anni", "β", "3,034", "¹⁰⁰Ru"))
            "Tc"    ->  arrayOf(arrayOf("⁹⁷Tc", "Sintetico", "2,6 x 10⁶ anni", "ε", "0,320", "⁹⁷Mo"), arrayOf("⁹⁸Tc", "Sintetico", "4,2 x 10⁶ anni", "β⁻", "1,796", "⁹⁸Ru"), arrayOf("⁹⁹Tc", "Sintetico", "211000 anni", "β⁻", "0,294", "⁹⁹Ru"))
            "Ru"    ->  arrayOf(arrayOf("⁹⁶Ru", "5,52%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁸Ru", "1,88%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("⁹⁹Ru", "12,7%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁰Ru", "12,6%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰¹Ru", "17,0%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰²Ru", "31,6%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁴Ru", "18,7%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁶Ru", "Sintetico", "373,59 giorni", "β⁻", "0,039", "¹⁰⁶Rh"))
            "Rh"    ->  arrayOf(arrayOf("¹⁰¹Rh", "Sintetico", "3,3 anni", "ε", "0,542", "¹⁰¹Ru"), arrayOf("¹⁰³Rh", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Pd"    ->  arrayOf(arrayOf("¹⁰²Pd", "1,02%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁴Pd", "11,14%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁵Pd", "22,33%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁶Pd", "27,33%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁷Pd", "Sintetico", "6,5 x 10⁶ anni", "β⁻", "0,033", "¹⁰⁷Ag"), arrayOf("¹⁰⁸Pd", "26,46%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁰Pd", "11,72%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ag"    ->  arrayOf(arrayOf("¹⁰⁷Ag", "51,839%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁹Ag", "48,161%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Cd"    ->  arrayOf(arrayOf("¹⁰⁸Cd", "0,89%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁰⁹Cd", "Sintetico", "462,6 giorni", "ε", "0,214", "¹⁰⁹Ag"), arrayOf("¹¹⁰Cd", "12,49%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹¹Cd", "12,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹²Cd", "24,13%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹³Cd", "13,47%", "7,7 x 10¹⁵ anni", "β⁻", "0,316", "¹¹³In"), arrayOf("¹¹⁴Cd", "28,73%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁶Cd", "7,49%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "In"    ->  arrayOf(arrayOf("¹¹³In", "4,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁵In", "95,7%", "4,41 x 10¹⁴ anni", "β⁻", "0,495", "¹¹⁵Sn"))
            "Sn"    ->  arrayOf(arrayOf("¹¹²Sn", "0,97%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁴Sn", "0,66%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁵Sn", "0,34%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁶Sn", "14,54%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁷Sn", "7,68%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁸Sn", "24,22%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹¹⁹Sn", "8,59%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁰Sn", "32,58%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²²Sn", "4,63%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁴Sn", "5,79%", ">1 x 10¹⁷ anni", "β⁻β⁻", "2,287", "¹²⁴Te"), arrayOf("¹²⁶Sn", "Sintetico", "1 x 10⁵ anni", "β⁻", "0,380", "¹²⁶Sb"))
            "Sb"    ->  arrayOf(arrayOf("¹²¹Sb", "57,36%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²³Sb", "42,64%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁵Sb", "Sintetico", "2,7582 anni", "β⁻", "0,767", "¹²⁵Te"))
            "Te"    ->  arrayOf(arrayOf("¹²⁰Te", "0,096%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²²Te", "2,603%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²³Te", "0,908%", "> 1 x 10¹³ anni", "ε", "0,051", "¹²³Sb"), arrayOf("¹²³Te", "0,908%", "> 1 x 10¹³ anni", "ε", "0,051", "¹²³Sb"), arrayOf("¹²⁴Te", "4,816%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁵Te", "7,139%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁶Te", "18,952%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁸Te", "31,687%", "2,2 x 10²⁴ anni", "ββ⁻", "0,867", "¹²⁸Xe"), arrayOf("¹³⁰Te", "33,799%", "7,9 x 10²⁰ anni", "ββ⁻", "2,528", "¹³⁰Xe"))
            "I"     ->  arrayOf(arrayOf("¹²³I", "Sintetico", "13 ore", "ε", "0,16", "¹²³Te"), arrayOf("¹²⁷I", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁹I", "Sintetico", "1,57 x 10⁷ anni", "β⁻", "0,194", "¹²⁹Xe"), arrayOf("¹³¹I", "Sintetico", "8,02070 giorni", "β⁻", "0,971", "¹³¹Xe"))
            "Xe"    ->  arrayOf(arrayOf("¹²⁵Xe", "Sintetico", "16,9 ore", "ε", "1,652", "¹²⁵I"), arrayOf("¹²⁶Xe", "0,09%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁷Xe", "Sintetico", "36,4 giorni", "ε", "0,662", "¹²⁷I"), arrayOf("¹²⁸Xe", "1,91%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹²⁹Xe", "26,4%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁰Xe", "4,07%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³¹Xe", "21,2%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³²Xe", "26,9%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³³Xe", "Sintetico", "5,243 giorni", "β⁻", "0,427", "¹³³Cs"), arrayOf("¹³⁴Xe", "10,4%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁵Xe", "Sinetico", "9,10 ore", "β⁻", "1,16", "¹³⁵Cs"))
            "Cs"    ->  arrayOf(arrayOf("¹³³Cs", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁴Cs", "Sintetico", "2,0648 anni", "ε - β⁻", "196,9 - 329,9", "¹³⁴Xe - ¹³⁴Ba"), arrayOf("¹³⁵", "Sintetico", "2,3 x 10⁶ anni", "β⁻", "43,1", "¹³⁵Ba"), arrayOf("¹³⁷Cs", "Sintetico", "30,09 anni", "β⁻", "188,4", "¹³⁷Ba"))
            "Ba"    ->  arrayOf(arrayOf("¹³⁰Ba", "0,106%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³²Ba", "0,101%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³³Ba", "Sintetico", "10,51 anni", "ε", "0,517", "¹³³Cs"), arrayOf("¹³⁴Ba", "2,417%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁵Ba", "6,592%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁶Ba", "7,854%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁷Ba", "11,23%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁸Ba", "71,7%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "La"    ->  arrayOf(arrayOf("¹³⁷La", "Sintetico", "60 000 anni", "ε", "0,600", "¹³⁷Ba"), arrayOf("¹³⁸La", "0,09%", "1,05 x 10¹¹ anni", "ε - β⁻", "1,737 - 1,044", "¹³⁸Ba - ¹³⁸Ce"), arrayOf("¹³⁹La", "99,91%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ce"    ->  arrayOf(arrayOf("¹³⁴Ce", "Sintetico", "3,16 giorni", "ε", "0,500", "¹³⁴La"), arrayOf("¹³⁶Ce", "0,19%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁸Ce", "0,25%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹³⁹Ce", "Sintetico", "137,640 giorni", "ε", "0,278", "¹³⁹La"), arrayOf("¹⁴⁰Ce", "88,48%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴¹Ce", "Sintetico", "32,501 giorni", "β⁻", "0,581", "¹⁴¹Pr"), arrayOf("¹⁴²Ce", "11,08%", "> 5 x 10¹⁶ anni", "β⁻", "Sconosciuta", "¹⁴²Nd"), arrayOf("¹⁴⁴Ce", "Sintetico", "284,893 giorni", "β⁻", "0,319", "¹⁴⁴Pr"))
            "Pr"    ->  arrayOf(arrayOf("¹⁴¹Pr", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴²Pr", "Sintetico", "19,12 ore", "β⁻ - ε", "2,162 - 0,745", "¹⁴²Nd - ¹⁴²Ce"), arrayOf("¹⁴³Pr", "Sintetico", "13,57 giorni", "β⁻", "0,934", "¹⁴³Nd"))
            "Nd"    ->  arrayOf(arrayOf("¹⁴²Nd", "27,13%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴³Nd", "12,18%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴⁴Nd", "23,8%", "2,29 x 10¹⁵ anni", "α", "1,905", "¹⁴⁰Ce"), arrayOf("¹⁴⁵Nd", "8,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴⁶Nd", "17,19%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴⁸Nd", "5,76%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁰Nd", "5,64%", "1,1 x 10¹⁹ anni", "β⁻β⁻", "3,367", "¹⁵⁰Sm"))
            "Pm"    ->  arrayOf(arrayOf("¹⁴⁵Pm", "Sintetico", "17,7 anni", "ε", "0,163", "¹⁴⁵Nd"), arrayOf("¹⁴⁶Pm", "Sintetico", "5,53 anni", "ε - β⁻", "1,472 - 1,542", "¹⁴⁶Nd - ¹⁴⁶Sm"), arrayOf("¹⁴⁷Pm", "Sintetico", "2,6234 anni", "β⁻", "0,224", "¹⁴⁷Sm"))
            "Sm"    ->  arrayOf(arrayOf("¹⁴⁴Sm", "3,07%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁴⁶Sm", "Sintetico", "1,03 x 10⁸ anni", "α", "2,529", "¹⁴²Nd"), arrayOf("¹⁴⁷Sm", "14,99%", "1,06 x 10¹¹ anni", "α", "2,310", "¹⁴³Nd"), arrayOf("¹⁴⁸Sm", "11,24%", "7 x 10¹⁵ anni", "α", "1,986", "¹⁴⁴Nd"), arrayOf("¹⁴⁹Sm", "13,82%", "> 2 x 10¹⁵ anni", "α", "1,870", "¹⁴⁵Nd"), arrayOf("¹⁵⁰Sm", "7,37%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵²Sm", "26,75%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁴Sm", "22,75%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Eu"    ->  arrayOf(arrayOf("¹⁵⁰Eu", "Sintetico", "36,9 anni", "ε", "2,261", "¹⁵⁰Sm"), arrayOf("¹⁵¹Eu", "47,8%", "5 x 10¹⁸ anni", "α", "1,964", "¹⁴⁷Pm"), arrayOf("¹⁵²Eu", "Sintetico", "13,516", "ε - β⁻", "1,874 - 1,819", "¹⁵²Sm - ¹⁵²Gd"), arrayOf("¹⁵³Eu", "52,2%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Gd"    ->  arrayOf(arrayOf("¹⁵²Gd", "0,20%", "1,08 x 10¹⁴ anni", "α", "2,205", "¹⁴⁸Sm"), arrayOf("¹⁵⁴Gd", "2,18%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁵Gd", "14,80%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁶Gd", "20,47%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁷Gd", "15,65%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁸Gd", "24,84%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁰Gd", "21,86%", "> 1,3 x 10²¹ anni", "β⁻β⁻", "1,7", "¹⁶⁰Dy"))
            "Tb"    ->  arrayOf(arrayOf("¹⁵⁷Tb", "Sintetico", "71 anni", "ε", "0,060", "¹⁵⁷Gd"), arrayOf("¹⁵⁸Tb", "Sintetico", "180 anni", "ε - β⁻", "1,220 - 0,937", "¹⁵⁸Gd - ¹⁵⁸Dy"), arrayOf("¹⁵⁹Tb", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Dy"    ->  arrayOf(arrayOf("¹⁵⁴Dy", "Sintetico", "3,0 x 10⁶ anni", "α", "2,947", "¹⁵⁰Gd"), arrayOf("¹⁵⁶Dy", "0,06%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁵⁸Dy", "0,10%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁰Dy", "2,34%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶¹Dy", "18,91%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶²Dy", "25,51%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶³Dy", "24,90%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁴Dy", "28,18%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Ho"    ->  arrayOf(arrayOf("¹⁶³Ho", "Sintetico", "4570 anni", "ε", "0,003", "¹⁶³Dy"), arrayOf("¹⁶⁴Ho", "Sintetico", "29 minuti", "ε", "0,987", "¹⁶⁴Dy"), arrayOf("¹⁶⁵Ho", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁶Ho", "Sintetico", "26,673 ore", "β⁻", "1,855", "¹⁶⁶Er"), arrayOf("¹⁶⁷Ho", "Sintetico", "3,1 ore", "β⁻", "1,007", "¹⁶⁷Er"))
            "Er"    ->  arrayOf(arrayOf("¹⁶⁰Er", "Sintetico", "28,58 ore", "ε", "0,330", "¹⁶⁰Ho"), arrayOf("¹⁶²Er", "0,139%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁴Er", "1,601%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁵Er", "Sintetico", "10,36 ore", "ε", "0,376", "¹⁶⁵Ho"), arrayOf("¹⁶⁶Er", "33,503%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁷Er", "22,869%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁸Er", "26,978%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁹Er", "Sintetico", "9,4 giorni", "β⁻", "0,351", "¹⁶⁹Tm"), arrayOf("¹⁷⁰Er", "14,910%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷¹Er", "Sintetico", "7,516 ore", "β⁻", "1,490", "¹⁷¹Tm"), arrayOf("¹⁷²Er", "Sintetico", "49,3 ore", "β⁻", "0,891", "¹⁷²Tm"))
            "Tm"    ->  arrayOf(arrayOf("¹⁶⁷Tm", "Sintetico", "9,25 giorni", "ε", "0,748", "¹⁶⁷Er"), arrayOf("¹⁶⁸Tm", "Sintetico", "93,1 giorni", "ε", "1,679", "¹⁶⁸Er"), arrayOf("¹⁶⁹Tm", "100%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁰Tm", "Sintetico", "128,6 giorni", "β⁻", "0,968", "¹⁷⁰Yb"), arrayOf("¹⁷¹Tm", "Sintetico", "1,92 anni", "β⁻", "0,096", "¹⁷¹Yb"))
            "Yb"    ->  arrayOf(arrayOf("¹⁶⁶Yb", "Sintetico", "56,7 ore", "ε", "0,304", "¹⁶⁶Tm"), arrayOf("¹⁶⁸Yb", "0,13%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁶⁹Yb", "Sintetico", "32,026 giorni", "ε", "0,909", "¹⁶⁹Tm"), arrayOf("¹⁷⁰Yb", "3,05%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷¹Yb", "14,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷²Yb", "21,9%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷³Yb", "16,12%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁴Yb", "31,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁵Yb", "Sintetico", "4,185 giorni", "β⁻", "0,470", "¹⁷⁵Lu"), arrayOf("¹⁷⁶Yb", "12,7%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁷Yb", "Sintetico", "1,911 ore", "β⁻", "1,399", "¹⁷⁷Lu"))
            "Lu"    ->  arrayOf(arrayOf("¹⁷³Lu", "Sintetico", "1,37 anni", "ε", "0,671", "¹⁷³Yb"), arrayOf("¹⁷⁴Lu", "Sintetico", "3,31 anni", "ε", "1,374", "¹⁷⁴Yb"), arrayOf("¹⁷⁵Lu", "97,41%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁶Lu", "2,59%", "3,78 x 10¹⁰ anni", "β⁻", "1,193", "¹⁷⁶Hf"))
            "Hf"    ->  arrayOf(arrayOf("¹⁷²Hf", "Sintetico", "1,87 anni", "ε", "0,350", "¹⁷²Lu"), arrayOf("¹⁷⁴Hf", "0,162%", "2 x 10¹⁵ anni", "α", "2,495", "¹⁷⁰Yb"), arrayOf("¹⁷⁶Hf", "5,206%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁷Hf", "18,606%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁸Hf", "27,297%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁷⁹Hf", "13,629%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁰Hf", "35,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸²Hf", "Sintetico", "9 x 10⁶ anni", "β", "0,373", "¹⁸²Ta"))
            "Ta"    ->  arrayOf(arrayOf("¹⁷⁹Ta", "Sintetico", "1,82 anni", "ε", "0,010", "¹⁷⁹Hf"), arrayOf("¹⁸⁰Ta", "Sintetico", "8,125 ore", "ε - β⁺", "0,854 - 0,708", "¹⁸⁰W - ¹⁸⁰Hf"), arrayOf("¹⁸¹Ta", "99,988%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "W"     ->  arrayOf(arrayOf("¹⁸⁰W", "0,12%", "1,8 x 10¹⁸ anni", "α", "2,516", "¹⁷⁶Hf"), arrayOf("¹⁸¹W", "Sintetico", "121,2 giorni", "ε", "0,188", "¹⁸¹Ta"), arrayOf("¹⁸²W", "26,50%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸³W", "14,31%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁴W", "30,64%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁵W", "Sintetico", "75,1 giorni", "β⁻", "0,433", "¹⁸⁵Re"), arrayOf("¹⁸⁶W", "28,43%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Re"    ->  arrayOf(arrayOf("¹⁸³Re", "37,4%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁷Re", "62,6%", "4,35 x 10¹⁰ anni", "α - β⁻", "1,653 - 0,003", "¹⁸³Ta - ¹⁸⁷Os"))
            "Os"    ->  arrayOf(arrayOf("¹⁸⁴Os", "0,02%", "> 5,6 x 10³ anni", "εε", "1,452", "¹⁸⁴W"), arrayOf("¹⁸⁵Os", "Sintetico", "93,6 giorni", "ε", "1,013", "¹⁸⁵Re"), arrayOf("¹⁸⁶Os", "1,59%", "> 2 x 10¹⁵ anni", "α", "2,822", "¹⁸²W"), arrayOf("¹⁸⁷Os", "1,96%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁸Os", "13,24%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁸⁹Os", "16,15%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁰Os", "26,26%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹¹Os", "Sintetico", "15,4 giorni", "β⁻", "0,314", "¹⁹¹Ir"), arrayOf("¹⁹²Os", "40,78%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁴Os", "Sintetico", "6 anni", "β⁻", "0,097", "¹⁹⁴Ir"))
            "Ir"    ->  arrayOf(arrayOf("¹⁹¹Ir", "37,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹²Ir", "Sintetico", "73,827 giorni", "β⁻ - ε", "1,460 - 1,046", "¹⁹²Pt - ¹⁹²Os"), arrayOf("¹⁹³Ir", "62,7%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Pt"    ->  arrayOf(arrayOf("¹⁹⁰Pt", "0,01%", "6,5 x 10¹¹ anni", "α", "3,248", "¹⁸⁶Os"), arrayOf("¹⁹¹Pt", "Sintetico", "2,76 giorni", "ε", "Sconosciuto", "¹⁹¹Ir"), arrayOf("¹⁹²Pt", "0,79%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹³Pt", "Sintetico", "50 anni", "ε", "0,057", "¹⁹³Ir"), arrayOf("¹⁹⁴Pt", "32,9%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁵Pt", "33,8%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁶Pt", "25,3%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁷Pt", "Sintetico", "19,8913", "β⁻", "0,719", "¹⁹⁷Au"), arrayOf("¹⁹⁸Pt", "7,2%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Au"    ->  arrayOf(arrayOf("¹⁹⁵Au", "Sintetico", "186 giorni", "β⁺", "0,2227", "¹⁹⁵Pt"), arrayOf("¹⁹⁷Au", "100%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Hg"    ->  arrayOf(arrayOf("¹⁹⁴Hg", "Sintetico", "444 anni", "ε", "0,040", "¹⁹⁴Au"), arrayOf("¹⁹⁵Hg", "Sintetico", "9,9 ore", "ε", "0,040", "¹⁹⁵Au"), arrayOf("¹⁹⁶Hg", "0,15%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁷Hg", "Sintetico", "64,14 ore", "ε", "0,600", "¹⁹⁷Au"), arrayOf("¹⁹⁸Hg", "9,97%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("¹⁹⁹Hg", "16,87%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁰Hg", "23,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰¹Hg", "13,18%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰²Hg", "29,86%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁴Hg", "6,87%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Tl"    ->  arrayOf(arrayOf("²⁰³Tl", "29,524%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁴Tl", "Sintetico", "3,77 anni", "β⁻ - ε", "0,761 - 0,347", "²⁰⁴Pb - ²⁰⁴Hg"), arrayOf("²⁰⁵Tl", "70,476%", "Stabile", "Stabile", "Stabile", "Stabile"))
            "Pb"    ->  arrayOf(arrayOf("²⁰²Pb", "Sintetico", "5,3 x 10⁴ anni", "ε", "Sconosciuto", "²⁰²Tl"), arrayOf("²⁰³Pb", "Sintetico", "2,162 giorni", "ε", "Sconosciuto", "²⁰³Tl"), arrayOf("²⁰⁴Pb", "1,4%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁵Pb", "Sintetico", "1,53 x 10⁷ anni", "ε", "0,051", "²⁰⁵Tl"), arrayOf("²⁰⁶Pb", "24,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁷Pb", "22,1%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁸Pb", "52,4%", "Stabile", "Stabile", "Stabile", "Stabile"), arrayOf("²⁰⁹Pb", "Sintetico", "3,25 ore", "β⁻", "0,051", "²⁰⁹Bi"), arrayOf("²¹⁰Pb", "Tracce", "22,3 anni", "α - β⁻", "3,792 - 0,064", "²⁰⁶Hg - ²¹⁰Bi"), arrayOf("²¹¹Pb", "Sintetico", "36,1 minuti", "β⁻", "0,051", "²¹¹Bi"))
            "Bi"    ->  arrayOf(arrayOf("²⁰⁷Bi", "Sintetico", "31,55 anni", "ε", "2,399", "²⁰⁷Pb"), arrayOf("²⁰⁸Bi", "Sintetico", "3,368 x 10⁵ anni", "ε", "2,880", "²⁰⁸Pb"), arrayOf("²⁰⁹Bi", "100%", "(2,01 ± 0,08) x 10¹⁹ anni", "α", "Sconosciuto", "²⁰⁵Tl"), arrayOf("²¹⁰Bi", "Sintetico", "5,01 giorni", "β⁻", "Sconosciuto", "²¹⁰Po"))
            "Po"    ->  arrayOf(arrayOf("²⁰⁶Po", "Sintetico", "8,8 giorni", "α - ε", "Sconosciuto - Sconosciuto", "²⁰²Pb - ²'⁰⁶Bi"), arrayOf("²⁰⁷Po", "Sintetico", "5,8 ore", "ε", "Sconosciuto", "²⁰⁷Bi"), arrayOf("²⁰⁸Po", "Sintetico", "2,898 anni", "α - ε", "5,215 - 1,401", "²⁰⁴Pb - ²⁰⁸Bi"), arrayOf("²⁰⁹Po", "Sintetico", "103 anni", "α - ε", "4,979 - 1,893", "²⁰⁵Pb - ²⁰⁹Bi"), arrayOf("²¹⁰P", "Tracce", "138,376 giorni", "α", "5,407", "²⁰⁶Pb"), arrayOf("²¹¹Po", "Sintetico", "0,516 s", "α", "Sconosciuto", "²⁰⁷Pb"), arrayOf("²¹²Po", "Sintetico", "0,298 μs - 0,299 μs", "α", "Sconosciuto", "²⁰⁸Pb"), arrayOf("²¹³Po", "Sintetico", "4 μs", "α", "Sconosciuto", "²⁰⁹Pb"), arrayOf("²¹⁴Po", "Sintetico", "163,7 μs", "α", "Sconosciuto", "²¹⁰Pb"), arrayOf("²¹⁵Po", "Sintetico", "1,78 ms", "α - β⁻", "Sconosciuto - Sconosciuto", "²¹¹Pb - ²¹⁵At"), arrayOf("²¹⁶Po", "Sintetico", "0,145 s", "α", "Sconosciuto", "²¹²Pb"), arrayOf("²¹⁸Po", "Sintetico", "3,10 minuti", "α - β⁻", "Sconosciuto - Sconosciuto", "²¹⁴Pb - ²¹⁸At"))
            "At"    ->  arrayOf(arrayOf("²⁰⁷At", "Sintetico", "1,81 ore", "ε - α", "3,910 - 5,873", "²⁰⁷Po - ²⁰³Bi"), arrayOf("²⁰⁸At", "Sintetico", "1,63 ore", "ε - α", "4,973 - 5,751", "²⁰⁸Po - ²⁰⁴Bi"), arrayOf("²⁰⁹At", "Sintetico", "5,41 ore", "ε - α", "3,486 - 5,757", "²⁰⁹Po - ²⁰⁵Bi"), arrayOf("²¹⁰At", "100%", "8,1 ore", "ε - α", "3,981 - 5,631", "²¹⁰Po - ²⁰⁶Bi"), arrayOf("²¹¹At", "Sintetico", "7,214 ore", "ε - α", "0,786 - 5,982", "²¹¹Po - ²⁰⁷Bi"), arrayOf("²¹³At", "Sintetico", "0,125 μs", "α", "9,254", "²⁰⁹Bi"), arrayOf("²¹⁵At", "Sintetico", "0,1 ms", "α", "8,178", "²¹¹Bi"), arrayOf("²¹⁸At", "Sintetico", "1,6 s", "β - α", "2,883 - 6,874", "²¹⁸Rn - ²¹⁴Bi"), arrayOf("²¹⁹At", "Sintetico", "56 s", "β - α", "1,700 - 6,390", "²¹⁹Rn - ²¹⁵Bi"), arrayOf("²²⁰At", "Sintetico", "3,71 minuti", "β - α", "3,650 - 6,050", "²²⁰Rn - ²¹⁶Bi"))
            "Rn"    ->  arrayOf(arrayOf("²¹¹Rn", "Sintetico", "14,6 ore", "ε - β⁺ - α", "2,892 - Sconosciuto - 5,965", "²¹¹At - ²¹¹At - ²⁰⁷Po"), arrayOf("²¹²Rn", "Sintetico", "24 minuti", "α", "Sconosciuto", "²⁰⁸Po"), arrayOf("²¹⁷Rn", "Sintetico", "0,6 ms", "α", "Sconosciuto", "²¹³Po"), arrayOf("²¹⁹Rn", "Tracce", "3,96 s", "α", "Sconosciuto", "²¹⁵Po"), arrayOf("²²⁰Rn", "Tracce", "55,61 s", "α", "6,404", "²¹⁶Po"), arrayOf("²²²Rn", "100%", "3,824 giorni", "α", "5,590", "²¹⁸Po"))
            "Fr"    ->  arrayOf(arrayOf("²²¹Fr", "Sintetico", "4,8 minuti", "α", "6,457", "²¹⁷At"), arrayOf("²²²Fr", "Sintetico", "14,2 minuti", "β⁻", "2,033", "²²²Ra"), arrayOf("²²³Fr", "100%", "22 minuti", "β⁻ - α", "1,149 - 5,430", "²²³Ra - ²¹⁹At"))
            "Ra"    ->  arrayOf(arrayOf("²²²Ra", "Sintetico", "38,0 s", "α", "Sconosciuto", "²¹⁸Rn"), arrayOf("²²³Ra", "Sintetico", "11,435 giorni", "α", "5,99", "²¹⁹Rn"), arrayOf("²²⁴Ra", "Sintetico", "3,66 giorni", "α", "5,789", "²²⁰Rn"), arrayOf("²²⁵Ra", "Sintetico", "14,9 giorni", "β⁻", "Sconosciuto", "²²⁵Ac"), arrayOf("²²⁶Ra", "100%", "1602 anni", "α", "4,871", "²²²Rn"), arrayOf("²²⁸Ra", "Sintetico", "5,75 anni", "β⁻", "0,046", "²²⁸Ac"))
            "Ac"    ->  arrayOf(arrayOf("²²⁵Ac", "Sintetico", "10 giorni", "α", "5,935", "²²¹Fr"), arrayOf("²²⁶Ac", "Sintetico", "29,37 ore", "β⁻ - ε - α", "1,117 - 0,640 - 5,536", "²²⁶Th - ²²⁶Ra - ²²²Fr"), arrayOf("²²⁷Ac", "100%", "21,773 anni", "β⁻ - α", "0,045 - 5,042", "²²⁷Th - ²²³Fr"))
            "Th"    ->  arrayOf(arrayOf("²²⁶Th", "Sintetico", "30,6 mesi", "α", "Sconosciuto", "²²²Ra"), arrayOf("²²⁷Th", "Sintetico", "18,72 giorni", "α", "Sconosciuto", "²²³Ra"), arrayOf("²²⁸Th", "Sintetico", "1,9116 anni", "α", "5,520", "²²⁴Ra"), arrayOf("²²⁹Th", "Sintetico", "7340 anni", "α", "5,168", "²²⁵Ra"), arrayOf("²³⁰Th", "Sintetico", "75380 anni", "α", "4,770", "²²⁶Ra"), arrayOf("²³¹Th", "Sintetico", "25,5 ore", "β⁻", "0,39", "²³¹Pa"), arrayOf("²³²Th", "100%", "1,405 x 10¹⁰ anni", "α", "4,083", "²²⁸Ra"), arrayOf("²³³Th", "Sintetico", "21,83 minuti", "β⁻", "Sconosciuto", "²³³Pa"), arrayOf("²³⁴Th", "Sintetico", "24,1 giorni", "β⁻", "0,27", "²³⁴Pa"))
            "Pa"    ->  arrayOf(arrayOf("²²⁹Pa", "Sintetico", "1,4 giorni", "α", "5,58", "²²⁵Ac"), arrayOf("²³⁰Pa", "Sintetico", "17,4 giorni", "ε - β⁻", "1,310 - 0,563", "²³⁰Th - ²³⁰U"), arrayOf("²³¹Pa", "100%", "32760 anni", "α", "5,149", "²²⁷Ac"), arrayOf("²³³Pa", "Sintetico", "26,967 giorni", "β⁻", "0,571", "²³³U"), arrayOf("²³⁴Pa", "Sintetico", "6,75 ore", "β⁻", "0,23", "²³⁴U"))
            "U"     ->  arrayOf(arrayOf("²³⁰U", "Sintetico", "20,8 giorni", "α", "Sconosciuto", "²²⁶Th"), arrayOf("²³¹U", "Sintetico", "4,28 giorni", "ε", "Sconosciuto", "²³¹Pa"), arrayOf("²³²U", "Sintetico", "68,9 anni", "α - fissione", "5,414", "²²⁸Th"), arrayOf("²³³U", "Sintetico", "159200 anni", "α - fissione", "4,909 - 197,93", "²²⁹Th"), arrayOf("²³⁴U", "0,005%", "245500 anni", "α - fissione", "4,859 - 197,78", "²³⁰Th"), arrayOf("²³⁵U", "0,72%", "7,038 x 10⁸ anni", "α - fissione", "4,679 - 202,48", "²³¹Th"), arrayOf("²³⁶U", "Sintetico", "2,342 x 10⁷ anni", "α - fissione", "4,572 - 201,82", "²³²Th"), arrayOf("²³⁷U", "Sintetico", "6,75 giorni", "β", "Sconosciuto", "²³⁷Np"), arrayOf("²³⁸U", "99,257%", "4,468 x 10⁹ anni", "α - fissione", "4,270 - 205,87", "²³⁴Th"), arrayOf("²³⁹U", "Sintetico", "23 minuti", "β", "Sconosciuto", "²³⁹Np"), arrayOf("²⁴⁰U", "Sintetico", "14,1 ore", "β", "Sconosciuto", "²⁴⁰Np"))
            "Np"    ->  arrayOf(arrayOf("²³⁵Np", "Sintetico", "369,1 giorni", "α - ε", "5,192 - 0,124", "²³¹Pa - ²³⁵U"), arrayOf("²³⁶Np", "Sintetico", "1,54 x 10⁵ anni", "ε - β⁻ - α", "0,940 - 0,940 - 5,020", "²³⁶U - ²³⁶Pu - ²³²Pa"), arrayOf("²³⁷Np", "Tracce", "2,144 x 10⁶ anni", "α - fissione", "4,959", "²³²Pa"), arrayOf("²³⁹Np", "Sintetico", "2,355 giorni", "β⁻", "Sconosciuto", "²³⁹Pu"))
            "Pu"    ->  arrayOf(arrayOf("²³⁸Pu", "Sintetico", "87,74 anni", "α - fissione", "5,5 - 204,66", "²³⁴U"), arrayOf("²³⁹Pu", "Tracce", "2,41 x 10⁴ anni", "α - fissione", "5,245 - 207,06", "²³⁵U"), arrayOf("²⁴⁰Pu", "Sintetico", "6,5 x 10³ anni", "α - fissione", "5,256 - 205,66", "²³⁶U"), arrayOf("²⁴¹Pu", "Sintetico", "14 anni", "β⁻ - fissione", "0,02078 - 210,83", "²⁴¹Am"), arrayOf("²⁴²Pu", "Sintetico", "3,73 x 10⁵ anni", "α - fissione", "4,984 - 209,47", "²³⁸U"), arrayOf("²⁴⁴Pu", "Sintetico", "8,08 x 10⁷ anni", "α - fissione", "4,666", "²⁴⁰U"))
            "Am"    ->  arrayOf(arrayOf("²⁴¹Am", "Sintetico", "432,2 anni", "α - fissione", "5,486", "²³⁷Np"), arrayOf("²⁴³Am", "Sintetico", "7370 anni", "α - fissione", "5,275", "²³⁹Np"))
            "Cm"    ->  arrayOf(arrayOf("²⁴²Cm", "Sintetico", "160 giorni", "α - fissione", "6,1", "²³⁸Pu"), arrayOf("²⁴³Cm", "Sintetico", "29,1 anni", "α - ε - fissione", "6,169 - 0,009", "²³⁹Pu - ²⁴³Am"), arrayOf("²⁴⁴Cm", "Sintetico", "18,1 anni", "α - fissione", "5,902", "²⁴⁰Pu"), arrayOf("²⁴⁵Cm", "Sintetico", "8500 anni", "α - fissione", "5,623", "²⁴¹Pu"), arrayOf("²⁴⁶Cm", "Sinteico", "4730 anni", "α - fissione", "5,475", "²⁴²Pu"), arrayOf("²⁴⁷Cm", "Sintetico", "1,56 x 10⁷ anni", "α", "5,353", "²⁴³Pu"), arrayOf("²⁴⁸Cm", "Sintetico", "3,4 x 10⁵ anni", "α - fissione", "5,162", "²⁴⁴Pu"), arrayOf("²⁵⁰Cm", "Sintetico", "9000 anni", "α - β⁻ - fissione", "5,162 - 0,037", "²⁴⁶Pu - ²⁵⁰Bk"))
            "Bk"    ->  arrayOf(arrayOf("²⁴⁵Bk", "Sintetico", "160 giorni", "ε - α", "0,180 - 6,455", "²⁴⁵Cm - ²⁴¹Am"), arrayOf("²⁴⁶Bk", "Sintetico", "1,8 giorni", "α - ε", "6,070 - 1,350", "²⁴²Am - ²⁴⁶Cm"), arrayOf("²⁴⁷Bk", "Sintetico", "1380 anni", "α", "5,889", "²⁴³Am"), arrayOf("²⁴⁸Bk", "Sintetico", "> 9 anni", "α", "5,803", "²⁴⁴Am"), arrayOf("²⁴⁹Bk", "Sintetico", "320 giorni", "α - β⁻ - fissione", "5,475 - 0,125", "²⁴⁵Am - ²⁴⁹Cf"))
            "Cf"    ->  arrayOf(arrayOf("²⁴⁸Cf", "Sintetico", "333,5 giorni", "α - fissione", "6,361", "²⁴⁴Cm"), arrayOf("²⁴⁹Cf", "Sintetico", "351 anni", "α - fissione", "6,295", "²⁴⁵Cm"), arrayOf("²⁵⁰Cf", "Sintetico", "13,08 anni", "α - fissione", "6,128", "²⁴⁶Cm"), arrayOf("²⁵¹Cf", "Sintetico", "898 anni", "α", "6,176", "²⁴⁷Cm"), arrayOf("²⁵²Cf", "Sintetico", "2,645 anni", "α - fissione", "6,217", "²⁴⁸Cm"), arrayOf("²⁵³Cf", "Sintetico", "17,81 giorni", "β⁻ - α", "0,285 - 6,124", "²⁵³Es - ²⁴⁴Cm"), arrayOf("²⁵⁴Cf", "Sintetico", "60,5 giorni", "α - fissione", "5,926", "²⁵⁰Cm"))
            "Es"    ->  arrayOf(arrayOf("²⁵²Es", "Sintetico", "471,7 giorni", "α - ε - β⁻", "6,760 - 1,260 - 0,480", "²⁴⁸Bk - ²⁵²Cf - ²⁵²Fm"), arrayOf("²⁵³Es", "Sintetico", "20,47 giorni", "α - fissione", "6,739", "²⁴⁹Bk"), arrayOf("²⁵⁴Es", "Sintetico", "275,7 giorni", "ε - β⁻ - α", "0,654 - 1,090 - 6,628", "²⁵⁴Cf - ²⁵⁴Fm - ²⁵⁰Bk"), arrayOf("²⁵⁵Es", "Sintetico", "39,8 giorni", "β⁻ - α - fissione", "0,288 - 6,436", "²⁵⁵Fm - ²⁵¹Bk"))
            "Fm"    ->  arrayOf(arrayOf("²⁵²Fm", "Sintetico", "25,39 ore", "α - fissione", "7,153", "²⁴⁸Cf"), arrayOf("²⁵³Fm", "Sintetico", "3 giorni", "ε - α", "0,333 - 7,197", "²⁵³Es - ²⁴⁹Cf"), arrayOf("²⁵⁵Fm", "Sintetico", "20,07 ore", "α - fissione", "7,241", "²⁵¹Cf"), arrayOf("²⁵⁷Fm", "Sintetico", "100,5 giorni", "α - fissione", "6,864", "²⁵³Cf"))
            "Md"    ->  arrayOf(arrayOf("²⁵⁷Md", "Sintetico", "5,52 ore", "ε - α - fissione", "0,406 - 7,558", "²⁵⁷Fm - ²⁵³Es"), arrayOf("²⁵⁸Md", "Sintetico", "51,5 giorni", "ε", "1,230", "²⁵⁸Fm"), arrayOf("²⁶⁰Md", "Sintetico", "31,8 giorni", "α - ε - β⁻ - fissione", "7,000 - Sconosciuto - 1,000", "²⁵⁶Es - ²⁶⁰Fm - ²⁶⁰No"))
            "No"    ->  arrayOf(arrayOf("²⁵³No", "Sintetico", "1,7 minuti", "α - ε", "8,440 - 3,200", "²⁴⁹Fm - ²⁵³Md"), arrayOf("²⁵⁵No", "Sintetico", "3,1 minuti", "α - ε", "8,445 - 2,012", "²⁵¹Fm - ²⁵⁵Md"), arrayOf("²⁵⁹No", "Sintetico", "3,1 minuti", "α - ε - fissione", "7,910 - 0,500", "²⁵⁵Fm - ²⁵⁹Md"))
            "Lr"    ->  arrayOf(arrayOf("²⁶²Lr", "Sintetico", "3,6 ore", "ε", "Sconosciuto", "²⁶²No"), arrayOf("²⁶⁶Lr", "Sintetico", "11 ore", "Fissione spontanea", "Sconosciuto", "Vario"))
            "Rf"    ->  arrayOf(arrayOf("²⁶¹Rf", "Sintetico", "70 s", "α - ε - fissione", "Sconosciuto", "²⁵⁷No - ²⁶¹Lr"), arrayOf("²⁶³Rf", "Sintetico", "15 minuti", "α - fissione", "Sconosciuto", "²⁵⁹No"), arrayOf("²⁶⁵Rf", "Sintetico", "1,1 minuti", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁶⁶Rf", "Sintetico", "23 s", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁶⁶Rf", "Sintetico", "1,3 ore", "Fissione", "Sconosciuto", "Sconosciuto"))
            "Db"    ->  arrayOf(arrayOf("²⁶²Db", "Sintetico", "34 s", "α - fissione", "Sconosciuto", "²⁵⁸Lr"), arrayOf("²⁶³DbDb", "Sintetico", "27 s", "α - fissione", "Sconosciuto", "²⁵⁹Lr"), arrayOf("²⁶⁶Db", "Sintetico", "20 minuti", "ε? - fissione", "Sconosciuto", "²⁶⁶Rf"), arrayOf("²⁶⁷DbDb", "Sintetico", "1,2 ore", "ε? - fissione", "Sconosciuto", "²⁶⁷Rf"), arrayOf("²⁶⁸Db", "Sintetico", "28 ore", "ε? - α - fissione", "Sconosciuto", "²⁶⁸Rf - ²⁶⁴Lr"), arrayOf("²⁷⁰Db", "Sintetico", "15 ore", "α - ε? - fissione", "Sconosciuto", "²⁶⁶Lr - ²⁷⁰Rf"))
            "Sg"    ->  arrayOf(arrayOf("²⁶⁵Sg", "Sintetico", "8,9 s", "α", "Sconosciuto", "²⁶¹Rf"), arrayOf("²⁶⁷Sg", "Sintetico", "1,4 minuti", "α - fissione", "Sconosciuto", "²⁶³Rf"), arrayOf("²⁶⁹Sg", "Sintetico", "14 minuti", "α", "Sconosciuto", "²⁶⁵Rf"), arrayOf("²⁷¹Sg", "Sintetico", "1,6 minuti", "α - fissione", "Sconosciuto", "²⁶⁷Rf"))
            "Bh"    ->  arrayOf(arrayOf("²⁶⁰Bh", "Sintetico", "35 ms", "α", "10,16", "²⁵⁶Db"), arrayOf("²⁶¹Bh", "Sintetico", "11,8 ms", "α", "10,10", "²⁵⁷Db"), arrayOf("²⁶⁴Bh", "Sintetico", "0,97 s", "α", "9,62 - 9,48", "²⁶⁰Db"), arrayOf("²⁶⁵Bh", "Sintetico", "0,9 s", "α", "9,24", "²⁶¹Db"), arrayOf("²⁶⁶Bh", "Sintetico", "0,9 s", "α", "9,77 - 9,04", "²⁶²Db"), arrayOf("²⁶⁷Bh", "Sintetico", "17 s", "α", "8,83", "²⁶³Db"), arrayOf("²⁷⁰Bh", "Sintetico", "61 s", "α", "8,93", "²⁶⁶Db"), arrayOf("²⁷²Bh", "Sintetico", "9,8 s", "α", "9,02", "²⁶⁸Db"), arrayOf("²⁷⁴Bh", "Sintetico", "~53 s", "α", "8,93", "²⁷⁰Db"))
            "Hs"    ->  arrayOf(arrayOf("²⁶³Hs", "Sintetico", "0,74 ms", "α", "10,89 - 10,72 - 10,57", "²⁵⁹Sg"), arrayOf("²⁶⁴Hs", "Sintetico", "~0,8 ms", "α", "10,43", "²⁶⁰Sg"), arrayOf("²⁶⁴Hs", "Sintetico", "0,8 ms", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁶⁵Hs", "Sintetico", "2,0 ms", "α", "Sconosciuto", "²⁶¹Sg"), arrayOf("²⁶⁷Hs", "Sintetico", "2,3 ms", "α", "10,18", "²⁶²Sg"), arrayOf("²⁶⁸Hs", "Sintetico", "0,36 s", "α", "9,48", "²⁶⁴Sg"), arrayOf("²⁶⁹Hs", "Sintetico", "9,7 s", "α", "9,21 - 9,10 - 8,97", "²⁶⁵Sg"), arrayOf("²⁷⁰Hs", "Sintetico", "3,6 s", "α", "9,02 - 8,88", "²⁶⁶Sg"))
            "Mt"    ->  arrayOf(arrayOf("²⁷⁴Mt", "Sintetico", "0,4 s", "α", "Sconosciuto", "²⁷⁰Bh"), arrayOf("²⁷⁶Mt", "Sintetico", "0,6 s", "α", "Sconosciuto", "²⁷²Bh"), arrayOf("²⁷⁸Mt", "Sintetico", "4 s", "α", "Sconosciuto", "²⁷⁴Bh"), arrayOf("²⁸²Mt", "Sintetico", "67 s?", "α", "Sconosciuto", "²⁷⁸Bh"))
            "Ds"    ->  arrayOf(arrayOf("²⁷⁹Ds", "Sintetico", "0,20 s", "α - fissione", "9,70", "²⁷⁵Hs"), arrayOf("²⁷³Ds", "Sintetico", "170 ms", "α", "11,14", "²⁶⁹Hs"), arrayOf("²⁶⁹Ds", "Sintetico", "0,17 ms", "α", "11,11", "²⁶⁵Hs"))
            "Rg"    ->  arrayOf(arrayOf("²⁷²Rg", "Sintetico", "1,6 ms", "α", "11,02 - 10,82", "²⁶⁸Mt"), arrayOf("²⁷⁴Rg", "Sintetico", "15 ms", "α", "11,23", "²⁷⁰Mt"), arrayOf("²⁷⁸Rg", "Sintetico", "4,2 ms", "α", "10,69", "²⁷⁴Mt"), arrayOf("²⁷⁹Rg", "Sintetico", "170 ms", "α", "10,37", "²⁷⁵Mt"), arrayOf("²⁸⁰Rg", "Sintetico", "3,6 s", "α", "9,75", "²⁷⁶Mt"), arrayOf("²⁸¹Rg", "Sintetico", "22,8 s", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁸²Rg", "Sintetico", "~0,5 s", "α", "9,00", "²⁷⁸Mt"))
            "Cn"    ->  arrayOf(arrayOf("²⁷⁷Cn", "Sintetico", "0,69 ms", "α", "Sconosciuto", "²⁷³Ds"), arrayOf("²⁸¹Cn", "Sintetico", "0,18 s", "α", "Sconosciuto", "²⁷⁷Ds"), arrayOf("²⁸²Cn", "Sintetico", "0.91 ms", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁸³Cn", "Sintetico", "4,2 s", "α - ε? - fissione", "Sconosciuto", "²⁷⁹Ds - ²⁸³Rg"), arrayOf("²⁸⁴Cn", "Sconosciuto", "98 ms", "α - fissione", "Sconosciuto", "²⁸⁰Ds"), arrayOf("²⁸⁵Cn", "Sintetico", "28 s", "α", "Sconosciuto", "²⁸¹Ds"), arrayOf("²⁸⁶Cn", "Sintetico", "8,45 s?", "Fissione", "Sconosciuto", "Sconosciuto"))
            "Nh"    ->  arrayOf(arrayOf("²⁷⁸Nh", "Sintetico", "1,4 ms", "α", "Sconosciuto", "²⁷⁴Rg"), arrayOf("²⁸²Nh", "Sintetico", "73 ms", "α", "Sconosciuto", "²⁷⁸Rg"), arrayOf("²⁸³Nh", "Sintetico", "75 ms", "α", "Sconosciuto", "²⁷⁹Rg"), arrayOf("²⁸⁴Nh", "Sintetico", "0,91 s", "α - ε", "Sconosciuto", "²⁸⁰Rg - ²⁸⁴Cn"), arrayOf("²⁸⁵Nh", "Sintetico", "4,2 s", "α", "Sintetico", "²⁸¹Rg"), arrayOf("²⁸⁶Nh", "Sintetico", "9,5 s", "α", "Sconosciuto", "²⁸²Rg"), arrayOf("²⁸⁷Nh", "Sintetico", "5,5 s?", "α", "Sconosciuto", "²⁸³Rg"), arrayOf("²⁹⁰Nh", "Sinteico", "2 s?", "α", "Sconosciuto", "²⁸⁶Rg"))
            "Fl"    ->  arrayOf(arrayOf("²⁸⁴Fl", "Sintetico", "2,5 ms", "Fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁸⁵Fl", "Sintetico", "~0,1 s", "α", "Sconosciuto", "²⁸¹Cn"), arrayOf("²⁸⁶Fl", "Sintetico", "~0,12 s", "α - fissione", "Sconosciuto", "Sconosciuto"), arrayOf("²⁸⁷Fl", "Sintetico", "~0,5 s", "α", "Sconosciuto", "²⁸³Cn"), arrayOf("²⁸⁸Fl", "Sintetico", "~0,7 s", "α", "Sconosciuto", "²⁸⁴Cn"), arrayOf("²⁸⁹Fl", "Sintetico", "~2 s", "α", "Sintetico", "²⁸⁵Cn"), arrayOf("²⁹⁰Fl", "Sintetico", "19 s?", "α - ε", "Sconosciuto", "²⁸⁶Cn - ²⁹⁰Nh"))
            "Mc"    ->  arrayOf(arrayOf("²⁸⁶Mc", "Sintetico", "20 ms", "α", "Sconosciuto", "²⁸²Nh"), arrayOf("²⁸⁷Mc", "Sintetico", "37 ms", "α", "Sconosciuto", "²⁸³Nh"), arrayOf("²⁸⁸Mc", "Sintetico", "164 ms", "α", "Sconosciuto", "²⁸⁴Nh"), arrayOf("²⁸⁹Mc", "Sintetico", "330 ms", "α", "Sconosciuto", "²⁸⁵Nh"), arrayOf("²⁹⁰Mc", "Sintetico", "650 ms", "α", "Sconosciuto", "²⁸⁶Nh"))
            "Lv"    ->  arrayOf(arrayOf("²⁹⁰Lv", "Sintetico", "8,3 ms", "α", "Sconosciuto", "²⁸⁶Fl"), arrayOf("²⁹¹Lv", "Sintetico", "19 ms", "α", "Sconosciuto", "²⁸⁷Fl"), arrayOf("²⁹²Lv", "Sintetico", "13 ms", "α", "Sconosciuto", "²⁸⁸Fl"), arrayOf("²⁹³Lv", "Sintetico", "57 ms", "α", "Sconosciuto", "²⁸⁹Fl"), arrayOf("²⁹⁴Lv", "Sintetico", "54 ms?", "α", "Sconosciuto", "²⁹⁰Fl"))
            "Ts"    ->  arrayOf(arrayOf("²⁹³Ts", "Sintetico", "14,2 ms", "α", "11,11 - 11,00 - 10,91", "²⁸⁹Mc"), arrayOf("²⁹⁴Ts", "Sintetico", "77,9 ms", "α", "10,81", "²⁹⁰Mc"))
            "Og"    ->  arrayOf(arrayOf("²⁹⁴Og", "Sintetico", "~0,89 ms", "α", "0,231", "²⁹⁰Lv"))
            else    ->  arrayOf()
        }
    }

    fun isotopiEng(name: String): Array<Array<String>> {
        return when (name) {
            "H"     ->  arrayOf(arrayOf("¹H", "99.985%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²H", "0.015%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³H", "Traces", "12,33 years", "β⁻", "0,019", "³He"), arrayOf("⁴H", "Synthetic", "(1,39 ± 0,10) x 10⁻²²", "n, γ", "2,910", "³H - ⁴He"))
            "He"    ->  arrayOf(arrayOf("³He", "1.37 ppm", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴He", "99.999863%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶He", "Synthetic", "806,7 ms", "β⁻", "3,508", "⁶Li"))
            "Li"    ->  arrayOf(arrayOf("⁶Li", "7,5%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷Li", "92.5%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷Li", "Synthetic", "836 ms", "β⁺, β⁻, α", "16,004", "⁸Be"))
            "Be"    ->  arrayOf(arrayOf("⁷Be", "Synthetic", "53,12 days", "ε", "0.862", "⁷Li"), arrayOf("⁹Be", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰Be", "Traces", "1,51 x 10⁶ years", "β⁻", "0,556", "¹⁰B"))
            "B"     ->  arrayOf(arrayOf("¹⁰B", "19,9%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹B", "80,1%", "Stable", "Stable", "Stable", "Stable"))
            "C"     ->  arrayOf(arrayOf("¹²C", "98,89%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³C", "1,11%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴C", "Traces", "5570 years", "β⁻", "0,156", "¹⁴N"))
            "N"     ->  arrayOf(arrayOf("¹³N", "Synthetic", "9,965 minutes", "ε", "2,220", "¹³C"), arrayOf("¹⁴N", "99,634%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵N", "0,366%", "Stable", "Stable", "Stable", "Stable"))
            "O"     ->  arrayOf(arrayOf("¹⁶O", "99,762%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷O", "0,038%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸O", "0,2%", "Stable", "Stable", "Stable", "Stable"))
            "F"     ->  arrayOf(arrayOf("¹⁹F", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Ne"    ->  arrayOf(arrayOf("²⁰Ne", "90,48%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²¹Ne", "0,27%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²²Ne", "9,25%", "Stable", "Stable", "Stable", "Stable"))
            "Na"    ->  arrayOf(arrayOf("²²Na", "Synthetic", "2,6020 years", "ε", "2,842", "²²Ne"), arrayOf("²³Na", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Mg"    ->  arrayOf(arrayOf("²⁴Mg", "78,99%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁵Mg", "10%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁶Mg", "11,01%", "Stable", "Stable", "Stable", "Stable"))
            "Al"    ->  arrayOf(arrayOf("²⁶Al", "Traces", "7,17 x 10⁵ years", "β⁺, ε", "4,004", "²⁶Mg"), arrayOf("²⁷Al", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Si"    ->  arrayOf(arrayOf("²⁸Si", "92,23%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁹Si", "4,67%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³⁰Si", "3,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³²Si", "Synthetic", "276 years", "β⁻", "0,224", "³²P"))
            "P"     ->  arrayOf(arrayOf("³¹P", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³²P", "Synthetic", "14,3 days", "β", "1,71", "³²S"), arrayOf("³³P", "Synthetic", "25,4 days", "β", "0,25", "³³S"))
            "S"     ->  arrayOf(arrayOf("³²S", "95,02%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³³S", "0,75%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³⁴S", "4,21%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³⁵S", "Synthetic", "87,32 days", "β⁻", "0,167", "³⁵Cl"), arrayOf("³⁶S", "0,02%", "Stable", "Stable", "Stable", "Stable"))
            "Cl"    ->  arrayOf(arrayOf("³¹Cl", "75,77%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³¹Cl", "Synthetic", "301000 years", "β⁻, ε", "0,709 - 1,142", "³⁶Ar - ³⁶S"), arrayOf("³¹Cl", "24,23%", "Stable", "Stable", "Stable", "Stable"))
            "Ar"    ->  arrayOf(arrayOf("³⁶Ar", "0,336%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³⁷Ar", "Synthetic", "35 days", "ε", "0,813", "³⁷Cl"), arrayOf("³⁸Ar", "0,063%", "Stable", "Stable", "Stable", "Stable"), arrayOf("³⁹Ar", "Synthetic", "269 years", "β⁻", "0,565", "³⁹K"), arrayOf("⁴⁰Ar", "99,600%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴²Ar", "Synthetic", "32,9 years", "β⁻", "0,600", "⁴²K"))
            "K"     ->  arrayOf(arrayOf("³⁹K", "93,26%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁰K", "0,01%", "1,277x 10⁹ years", "β⁻, ε", "1,311 - 1,505", "⁴⁰Ca - ⁴⁰Ar"), arrayOf("⁴¹K", "6,73%", "Stable", "Stable", "Stable", "Stable"))
            "Ca"    ->  arrayOf(arrayOf("⁴⁰Ca", "96,941%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴¹Ca", "Synthetic", "103000 years", "ε", "0,421", "⁴¹K"), arrayOf("⁴²Ca", "0,647%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴³Ca", "0,135%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁴Ca", "2,086%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁶Ca", "0,004%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁸Ca", "0,187%", "4,2 x 10¹⁹ years", "ββ⁻", "4,272", "⁴⁸Ti"))
            "Sc"    ->  arrayOf(arrayOf("⁴⁵Sc", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁶Sc", "Synthetic", "38,79 days", "β⁻", "2,367", "⁴⁶Ti"))
            "Ti"    ->  arrayOf(arrayOf("⁴⁴Ti", "Synthetic", "63 years", "s", "0,268", "⁴⁴Sc"), arrayOf("⁴⁶Ti", "8,0%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁷Ti", "7,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁸Ti", "73,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁴⁹Ti", "5,5%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁰Ti", "5,4%", "Stable", "Stable", "Stable", "Stable"))
            "V"     ->  arrayOf(arrayOf("⁴⁸V", "Synthetic", "15,9735 days", "ε", "4,012", "⁴⁸Ti"), arrayOf("⁴⁹V", "Synthetic", "330 days", "ε", "0,602", "⁴⁹Ti"), arrayOf("⁵⁰V", "0,25%", "1,4 x 10¹⁷ years", "ε, β", "2,208 - 1,037", "⁵⁰Ti - ⁵⁰Cr"), arrayOf("⁵⁰Ti", "99,75%", "Stable", "Stable", "Stable", "Stable"))
            "Cr"    ->  arrayOf(arrayOf("⁵⁰Cr", "4,345%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵¹Cr", "Synthetic", "27,7025 days", "ε", "0,753", "⁵¹V"), arrayOf("⁵²Cr", "83,789%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵³Cr", "9,501%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁴Cr", "2,365%", "Stable", "Stable", "Stable", "Stable"))
            "Mn"    ->  arrayOf(arrayOf("⁵²Mn", "Synthetic", "5,591 days", "ε", "4,712", "⁵²Cr"), arrayOf("⁵³Mn", "Synthetic", "3,74 million years", "ε", "0,597", "⁵³Cr"), arrayOf("⁵⁴Mn", "Synthetic", "27,7025", "ε, β⁻", "1,377 - 0,697", "⁵⁴Cr - ⁵⁴Fe"), arrayOf("⁵⁵Mn", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Fe"    ->  arrayOf(arrayOf("⁵⁴Fe", "5,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁵Fe", "Synthetic", "2,73 years", "ε", "0,231", "⁵⁵Mn"), arrayOf("⁵⁶Fe", "91,72%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁷Fe", "2,2%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁸Fe", "0,28%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁹Fe", "Synthetic", "44,503 days", "β⁻", "1,565", "⁵⁹Co"), arrayOf("⁶⁰Fe", "Synthetic", "2,6 x 106 years", "β⁻", "3,978", "⁶⁰Co"))
            "Co"    ->  arrayOf(arrayOf("⁵⁶Co", "Synthetic", "77,27 days", "ε", "4,566", "⁵⁶Fe"), arrayOf("⁵⁷Co", "Synthetic", "721,79 days", "ε", "0,836", "⁵⁷Fe"), arrayOf("⁵⁸Co", "Synthetic", "70,86 days", "ε", "2,307", "⁵⁸Fe"), arrayOf("⁵⁹Co", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶⁰Co", "Synthetic", "5,2714 years", "β⁻", "2,824", "⁶⁰Ni"))
            "Ni"    ->  arrayOf(arrayOf("⁵⁶Ni", "Synthetic", "6,077 days", "ε", "2,136", "⁵⁶Co"), arrayOf("⁵⁸Ni", "68,077%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁵⁹Ni", "Synthetic", "76000 years", "ε", "1,702", "⁵⁹Co"), arrayOf("⁶⁰Ni", "26,233%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶¹Ni", "1,1399%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶²Ni", "3,6346%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶³Ni", "Synthetic", "100,1 years", "β⁻", "2,137", "⁶³Cu"), arrayOf("⁶⁴Ni", "0,9255%", "Stable", "Stable", "Stable", "Stable"))
            "Cu"    ->  arrayOf(arrayOf("⁶³Cu", "69,17%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶⁴Cu", "Synthetic", "12,7 hours", "ε, β⁻", "1,675 - 0,579", "⁶⁴Ni - ⁶⁴Zn"), arrayOf("⁶⁵Ni", "30,83%", "Stable", "Stable", "Stable", "Stable"))
            "Zn"    ->  arrayOf(arrayOf("⁶⁴Zn", "48,6%", ">2,3 x 10¹⁸ years", "β⁺β⁺", "1,096", "⁶⁴Ni"), arrayOf("⁶⁵Zn", "Synthetic", "244,26 days", "ε", "1,352", "⁶⁵Cu"), arrayOf("⁶⁶Zn", "27,9%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶⁷Zn", "4,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁶⁸Zn", "18,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁰Zn", "0,6%", ">1,3 x 10¹⁶ years", "β⁻β⁻", "0,998", "⁷⁰Ge"), arrayOf("⁷²Zn", "Synthetic", "46,5 hours", "β", "0,458", "⁷²Ga"))
            "Ga"    ->  arrayOf(arrayOf("⁶⁹Ga", "60,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷¹Ga", "39,9%", "Stable", "Stable", "Stable", "Stable"))
            "Ge"    ->  arrayOf(arrayOf("⁷⁰Ge", "20,52%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷²Ge", "27,45%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷³Ge", "7,76%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁴Ge", "36,52%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁶Ge", "7,75", "1,78 x 10^²¹ years", "Unknown", "Unknown", "Unknown"))
            "As"    ->  arrayOf(arrayOf("⁷⁵As", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Se"    ->  arrayOf(arrayOf("⁷²Se", "Synthetic", "8,4 days", "ε", "0,335", "⁷²As"), arrayOf("⁷⁴Se", "0,87%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁵Se", "Synthetic", "119,779 days", "ε", "0,864", "⁷⁵As"), arrayOf("⁷⁶Se", "9.36%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁷Se", "7,63%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁸Se", "23,78", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁷⁹Se", "Synthetic", "1,13 x 10⁶ years", "β", "0,151", "⁷⁹Br"), arrayOf("⁸⁰Se", "49,61%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸²Se", "8,73%", "1,08 x 10²⁰ years", "2β", "2,995", "⁸²Kr"))
            "Br"    ->  arrayOf(arrayOf("⁷⁹Br", "50,69%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸¹Br", "49,31%", "Stable", "Stable", "Stable", "Stable"))
            "Kr"    ->  arrayOf(arrayOf("⁷⁸Kr", "0,35%", "2,3 x 10²⁰ years", "εε", "Unknown", "⁷⁸Se"), arrayOf("⁷⁹Kr", "Synthetic", "35,04 hours", "ε, β⁺, γ", "Unknown - 0,604 - 0,26 - 0,39", "⁷⁹Br - ⁷⁹Br"), arrayOf("⁸⁰Kr", "2,25%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸¹Kr", "Synthetic", "229000 years", "ε, γ", "Unknown - 0,281", "⁸¹Br - Unknown"), arrayOf("⁸²Kr", "11,6%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸³Kr", "11,5%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁴Kr", "57%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁵Kr", "Synthetic", "10,756 years", "β", "0,687", "⁸⁵Rb"), arrayOf("⁸⁶Kr", "17,3%", "Stable", "Stable", "Stable", "Stable"))
            "Rb"    ->  arrayOf(arrayOf("⁸⁵Rb", "72,168%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁷Rb", "27,835%", "4,88 x 10¹⁰ years", "β⁻", "0,283", "⁸⁷Sr"))
            "Sr"    ->  arrayOf(arrayOf("⁸⁴Sr", "0,56%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁶Sr", "9,86%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁷Sr", "7,0%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁸⁸Sr", "82,58%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁰Sr", "Synthetic", "28,78 years", "β⁻", "0,546", "⁹⁰Y"))
            "Y"     ->  arrayOf(arrayOf("⁸⁹Y", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁰Y", "Synthetic", "2,67 days", "β⁻", "2,284", "⁹⁰Zr"))
            "Zr"    ->  arrayOf(arrayOf("⁹⁰Zr", "51,45%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹¹Zr", "11,22%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹²Zr", "17,15%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹³Zr", "Synthetic", "1,53 x 10⁶ years", "β⁻", "0,091", "⁹³Nb"), arrayOf("⁹⁴Zr", "17,38%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁶Zr", "2,8%", "3,8 x 10¹⁹ years", "β⁻", "3,350", "⁹⁶Mo"))
            "Nb"    ->  arrayOf(arrayOf("⁹¹Nb", "Synthetic", "680 years", "ε", "1,253", "⁹¹Zr"), arrayOf("⁹²Nb", "Synthetic", "3,47 x 10⁷ years", "β⁻, ε", "0,356 - 2,006", "⁹²Mo - ⁹²Zr"), arrayOf("⁹³Nb", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁴Nb", "Synthetic", "20300 years", "β⁻", "2,045", "⁹⁴Mo"))
            "Mo"    ->  arrayOf(arrayOf("⁹²Mo", "14,84%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹³Mo", "Synthetic", "4000 years", "ε", "0,405", "⁹³Nb"), arrayOf("⁹⁴Mo", "9,25%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁵Mo", "15,92%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁶Mo", "16,68%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁷Mo", "9,55%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁸Mo", "24,13%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁹Mo", "Synthetic", "65,94 hours", "β", "1,357", "⁹⁹Tc"), arrayOf("¹⁰⁰Mo", "9,63%", "7,8 x 10¹⁸ years", "β", "3,034", "¹⁰⁰Ru"))
            "Tc"    ->  arrayOf(arrayOf("⁹⁷Tc", "Synthetic", "2,6 x 10⁶ years", "ε", "0,320", "⁹⁷Mo"), arrayOf("⁹⁸Tc", "Synthetic", "4,2 x 10⁶ years", "β⁻", "1,796", "⁹⁸Ru"), arrayOf("⁹⁹Tc", "Synthetic", "211000 years", "β⁻", "0,294", "⁹⁹Ru"))
            "Ru"    ->  arrayOf(arrayOf("⁹⁶Ru", "5,52%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁸Ru", "1,88%", "Stable", "Stable", "Stable", "Stable"), arrayOf("⁹⁹Ru", "12,7%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁰Ru", "12,6%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰¹Ru", "17,0%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰²Ru", "31,6%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁴Ru", "18,7%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁶Ru", "Synthetic", "373,59 days", "β⁻", "0,039", "¹⁰⁶Rh"))
            "Rh"    ->  arrayOf(arrayOf("¹⁰¹Rh", "Synthetic", "3,3 years", "ε", "0,542", "¹⁰¹Ru"), arrayOf("¹⁰³Rh", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Pd"    ->  arrayOf(arrayOf("¹⁰²Pd", "1,02%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁴Pd", "11,14%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁵Pd", "22,33%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁶Pd", "27,33%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁷Pd", "Synthetic", "6,5 x 10⁶ years", "β⁻", "0,033", "¹⁰⁷Ag"), arrayOf("¹⁰⁸Pd", "26,46%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁰Pd", "11,72%", "Stable", "Stable", "Stable", "Stable"))
            "Ag"    ->  arrayOf(arrayOf("¹⁰⁷Ag", "51,839%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁹Ag", "48,161%", "Stable", "Stable", "Stable", "Stable"))
            "Cd"    ->  arrayOf(arrayOf("¹⁰⁸Cd", "0,89%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁰⁹Cd", "Synthetic", "462,6 days", "ε", "0,214", "¹⁰⁹Ag"), arrayOf("¹¹⁰Cd", "12,49%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹¹Cd", "12,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹²Cd", "24,13%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹³Cd", "13,47%", "7,7 x 10¹⁵ years", "β⁻", "0,316", "¹¹³In"), arrayOf("¹¹⁴Cd", "28,73%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁶Cd", "7,49%", "Stable", "Stable", "Stable", "Stable"))
            "In"    ->  arrayOf(arrayOf("¹¹³In", "4,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁵In", "95,7%", "4,41 x 10¹⁴ years", "β⁻", "0,495", "¹¹⁵Sn"))
            "Sn"    ->  arrayOf(arrayOf("¹¹²Sn", "0,97%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁴Sn", "0,66%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁵Sn", "0,34%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁶Sn", "14,54%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁷Sn", "7,68%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁸Sn", "24,22%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹¹⁹Sn", "8,59%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁰Sn", "32,58%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²²Sn", "4,63%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁴Sn", "5,79%", ">1 x 10¹⁷ years", "β⁻β⁻", "2,287", "¹²⁴Te"), arrayOf("¹²⁶Sn", "Synthetic", "1 x 10⁵ years", "β⁻", "0,380", "¹²⁶Sb"))
            "Sb"    ->  arrayOf(arrayOf("¹²¹Sb", "57,36%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²³Sb", "42,64%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁵Sb", "Synthetic", "2,7582 years", "β⁻", "0,767", "¹²⁵Te"))
            "Te"    ->  arrayOf(arrayOf("¹²⁰Te", "0,096%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²²Te", "2,603%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²³Te", "0,908%", "> 1 x 10¹³ years", "ε", "0,051", "¹²³Sb"), arrayOf("¹²³Te", "0,908%", "> 1 x 10¹³ years", "ε", "0,051", "¹²³Sb"), arrayOf("¹²⁴Te", "4,816%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁵Te", "7,139%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁶Te", "18,952%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁸Te", "31,687%", "2,2 x 10²⁴ years", "ββ⁻", "0,867", "¹²⁸Xe"), arrayOf("¹³⁰Te", "33,799%", "7,9 x 10²⁰ years", "ββ⁻", "2,528", "¹³⁰Xe"))
            "I"     ->  arrayOf(arrayOf("¹²³I", "Synthetic", "13 hours", "ε", "0,16", "¹²³Te"), arrayOf("¹²⁷I", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁹I", "Synthetic", "1,57 x 10⁷ years", "β⁻", "0,194", "¹²⁹Xe"), arrayOf("¹³¹I", "Synthetic", "8,02070 days", "β⁻", "0,971", "¹³¹Xe"))
            "Xe"    ->  arrayOf(arrayOf("¹²⁵Xe", "Synthetic", "16,9 hours", "ε", "1,652", "¹²⁵I"), arrayOf("¹²⁶Xe", "0,09%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁷Xe", "Synthetic", "36,4 days", "ε", "0,662", "¹²⁷I"), arrayOf("¹²⁸Xe", "1,91%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹²⁹Xe", "26,4%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁰Xe", "4,07%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³¹Xe", "21,2%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³²Xe", "26,9%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³³Xe", "Synthetic", "5,243 days", "β⁻", "0,427", "¹³³Cs"), arrayOf("¹³⁴Xe", "10,4%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁵Xe", "Sinetico", "9,10 hours", "β⁻", "1,16", "¹³⁵Cs"))
            "Cs"    ->  arrayOf(arrayOf("¹³³Cs", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁴Cs", "Synthetic", "2,0648 years", "ε - β⁻", "196,9 - 329,9", "¹³⁴Xe - ¹³⁴Ba"), arrayOf("¹³⁵", "Synthetic", "2,3 x 10⁶ years", "β⁻", "43,1", "¹³⁵Ba"), arrayOf("¹³⁷Cs", "Synthetic", "30,09 years", "β⁻", "188,4", "¹³⁷Ba"))
            "Ba"    ->  arrayOf(arrayOf("¹³⁰Ba", "0,106%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³²Ba", "0,101%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³³Ba", "Synthetic", "10,51 years", "ε", "0,517", "¹³³Cs"), arrayOf("¹³⁴Ba", "2,417%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁵Ba", "6,592%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁶Ba", "7,854%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁷Ba", "11,23%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁸Ba", "71,7%", "Stable", "Stable", "Stable", "Stable"))
            "La"    ->  arrayOf(arrayOf("¹³⁷La", "Synthetic", "60 000 years", "ε", "0,600", "¹³⁷Ba"), arrayOf("¹³⁸La", "0,09%", "1,05 x 10¹¹ years", "ε - β⁻", "1,737 - 1,044", "¹³⁸Ba - ¹³⁸Ce"), arrayOf("¹³⁹La", "99,91%", "Stable", "Stable", "Stable", "Stable"))
            "Ce"    ->  arrayOf(arrayOf("¹³⁴Ce", "Synthetic", "3,16 days", "ε", "0,500", "¹³⁴La"), arrayOf("¹³⁶Ce", "0,19%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁸Ce", "0,25%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹³⁹Ce", "Synthetic", "137,640 days", "ε", "0,278", "¹³⁹La"), arrayOf("¹⁴⁰Ce", "88,48%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴¹Ce", "Synthetic", "32,501 days", "β⁻", "0,581", "¹⁴¹Pr"), arrayOf("¹⁴²Ce", "11,08%", "> 5 x 10¹⁶ years", "β⁻", "Unknown", "¹⁴²Nd"), arrayOf("¹⁴⁴Ce", "Synthetic", "284,893 days", "β⁻", "0,319", "¹⁴⁴Pr"))
            "Pr"    ->  arrayOf(arrayOf("¹⁴¹Pr", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴²Pr", "Synthetic", "19,12 hours", "β⁻ - ε", "2,162 - 0,745", "¹⁴²Nd - ¹⁴²Ce"), arrayOf("¹⁴³Pr", "Synthetic", "13,57 days", "β⁻", "0,934", "¹⁴³Nd"))
            "Nd"    ->  arrayOf(arrayOf("¹⁴²Nd", "27,13%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴³Nd", "12,18%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴⁴Nd", "23,8%", "2,29 x 10¹⁵ years", "α", "1,905", "¹⁴⁰Ce"), arrayOf("¹⁴⁵Nd", "8,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴⁶Nd", "17,19%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴⁸Nd", "5,76%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁰Nd", "5,64%", "1,1 x 10¹⁹ years", "β⁻β⁻", "3,367", "¹⁵⁰Sm"))
            "Pm"    ->  arrayOf(arrayOf("¹⁴⁵Pm", "Synthetic", "17,7 years", "ε", "0,163", "¹⁴⁵Nd"), arrayOf("¹⁴⁶Pm", "Synthetic", "5,53 years", "ε - β⁻", "1,472 - 1,542", "¹⁴⁶Nd - ¹⁴⁶Sm"), arrayOf("¹⁴⁷Pm", "Synthetic", "2,6234 years", "β⁻", "0,224", "¹⁴⁷Sm"))
            "Sm"    ->  arrayOf(arrayOf("¹⁴⁴Sm", "3,07%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁴⁶Sm", "Synthetic", "1,03 x 10⁸ years", "α", "2,529", "¹⁴²Nd"), arrayOf("¹⁴⁷Sm", "14,99%", "1,06 x 10¹¹ years", "α", "2,310", "¹⁴³Nd"), arrayOf("¹⁴⁸Sm", "11,24%", "7 x 10¹⁵ years", "α", "1,986", "¹⁴⁴Nd"), arrayOf("¹⁴⁹Sm", "13,82%", "> 2 x 10¹⁵ years", "α", "1,870", "¹⁴⁵Nd"), arrayOf("¹⁵⁰Sm", "7,37%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵²Sm", "26,75%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁴Sm", "22,75%", "Stable", "Stable", "Stable", "Stable"))
            "Eu"    ->  arrayOf(arrayOf("¹⁵⁰Eu", "Synthetic", "36,9 years", "ε", "2,261", "¹⁵⁰Sm"), arrayOf("¹⁵¹Eu", "47,8%", "5 x 10¹⁸ years", "α", "1,964", "¹⁴⁷Pm"), arrayOf("¹⁵²Eu", "Synthetic", "13,516", "ε - β⁻", "1,874 - 1,819", "¹⁵²Sm - ¹⁵²Gd"), arrayOf("¹⁵³Eu", "52,2%", "Stable", "Stable", "Stable", "Stable"))
            "Gd"    ->  arrayOf(arrayOf("¹⁵²Gd", "0,20%", "1,08 x 10¹⁴ years", "α", "2,205", "¹⁴⁸Sm"), arrayOf("¹⁵⁴Gd", "2,18%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁵Gd", "14,80%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁶Gd", "20,47%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁷Gd", "15,65%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁸Gd", "24,84%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁰Gd", "21,86%", "> 1,3 x 10²¹ years", "β⁻β⁻", "1,7", "¹⁶⁰Dy"))
            "Tb"    ->  arrayOf(arrayOf("¹⁵⁷Tb", "Synthetic", "71 years", "ε", "0,060", "¹⁵⁷Gd"), arrayOf("¹⁵⁸Tb", "Synthetic", "180 years", "ε - β⁻", "1,220 - 0,937", "¹⁵⁸Gd - ¹⁵⁸Dy"), arrayOf("¹⁵⁹Tb", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Dy"    ->  arrayOf(arrayOf("¹⁵⁴Dy", "Synthetic", "3,0 x 10⁶ years", "α", "2,947", "¹⁵⁰Gd"), arrayOf("¹⁵⁶Dy", "0,06%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁵⁸Dy", "0,10%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁰Dy", "2,34%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶¹Dy", "18,91%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶²Dy", "25,51%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶³Dy", "24,90%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁴Dy", "28,18%", "Stable", "Stable", "Stable", "Stable"))
            "Ho"    ->  arrayOf(arrayOf("¹⁶³Ho", "Synthetic", "4570 years", "ε", "0,003", "¹⁶³Dy"), arrayOf("¹⁶⁴Ho", "Synthetic", "29 minutes", "ε", "0,987", "¹⁶⁴Dy"), arrayOf("¹⁶⁵Ho", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁶Ho", "Synthetic", "26,673 hours", "β⁻", "1,855", "¹⁶⁶Er"), arrayOf("¹⁶⁷Ho", "Synthetic", "3,1 hours", "β⁻", "1,007", "¹⁶⁷Er"))
            "Er"    ->  arrayOf(arrayOf("¹⁶⁰Er", "Synthetic", "28,58 hours", "ε", "0,330", "¹⁶⁰Ho"), arrayOf("¹⁶²Er", "0,139%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁴Er", "1,601%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁵Er", "Synthetic", "10,36 hours", "ε", "0,376", "¹⁶⁵Ho"), arrayOf("¹⁶⁶Er", "33,503%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁷Er", "22,869%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁸Er", "26,978%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁹Er", "Synthetic", "9,4 days", "β⁻", "0,351", "¹⁶⁹Tm"), arrayOf("¹⁷⁰Er", "14,910%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷¹Er", "Synthetic", "7,516 hours", "β⁻", "1,490", "¹⁷¹Tm"), arrayOf("¹⁷²Er", "Synthetic", "49,3 hours", "β⁻", "0,891", "¹⁷²Tm"))
            "Tm"    ->  arrayOf(arrayOf("¹⁶⁷Tm", "Synthetic", "9,25 days", "ε", "0,748", "¹⁶⁷Er"), arrayOf("¹⁶⁸Tm", "Synthetic", "93,1 days", "ε", "1,679", "¹⁶⁸Er"), arrayOf("¹⁶⁹Tm", "100%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁰Tm", "Synthetic", "128,6 days", "β⁻", "0,968", "¹⁷⁰Yb"), arrayOf("¹⁷¹Tm", "Synthetic", "1,92 years", "β⁻", "0,096", "¹⁷¹Yb"))
            "Yb"    ->  arrayOf(arrayOf("¹⁶⁶Yb", "Synthetic", "56,7 hours", "ε", "0,304", "¹⁶⁶Tm"), arrayOf("¹⁶⁸Yb", "0,13%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁶⁹Yb", "Synthetic", "32,026 days", "ε", "0,909", "¹⁶⁹Tm"), arrayOf("¹⁷⁰Yb", "3,05%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷¹Yb", "14,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷²Yb", "21,9%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷³Yb", "16,12%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁴Yb", "31,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁵Yb", "Synthetic", "4,185 days", "β⁻", "0,470", "¹⁷⁵Lu"), arrayOf("¹⁷⁶Yb", "12,7%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁷Yb", "Synthetic", "1,911 hours", "β⁻", "1,399", "¹⁷⁷Lu"))
            "Lu"    ->  arrayOf(arrayOf("¹⁷³Lu", "Synthetic", "1,37 years", "ε", "0,671", "¹⁷³Yb"), arrayOf("¹⁷⁴Lu", "Synthetic", "3,31 years", "ε", "1,374", "¹⁷⁴Yb"), arrayOf("¹⁷⁵Lu", "97,41%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁶Lu", "2,59%", "3,78 x 10¹⁰ years", "β⁻", "1,193", "¹⁷⁶Hf"))
            "Hf"    ->  arrayOf(arrayOf("¹⁷²Hf", "Synthetic", "1,87 years", "ε", "0,350", "¹⁷²Lu"), arrayOf("¹⁷⁴Hf", "0,162%", "2 x 10¹⁵ years", "α", "2,495", "¹⁷⁰Yb"), arrayOf("¹⁷⁶Hf", "5,206%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁷Hf", "18,606%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁸Hf", "27,297%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁷⁹Hf", "13,629%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁰Hf", "35,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸²Hf", "Synthetic", "9 x 10⁶ years", "β", "0,373", "¹⁸²Ta"))
            "Ta"    ->  arrayOf(arrayOf("¹⁷⁹Ta", "Synthetic", "1,82 years", "ε", "0,010", "¹⁷⁹Hf"), arrayOf("¹⁸⁰Ta", "Synthetic", "8,125 hours", "ε - β⁺", "0,854 - 0,708", "¹⁸⁰W - ¹⁸⁰Hf"), arrayOf("¹⁸¹Ta", "99,988%", "Stable", "Stable", "Stable", "Stable"))
            "W"     ->  arrayOf(arrayOf("¹⁸⁰W", "0,12%", "1,8 x 10¹⁸ years", "α", "2,516", "¹⁷⁶Hf"), arrayOf("¹⁸¹W", "Synthetic", "121,2 days", "ε", "0,188", "¹⁸¹Ta"), arrayOf("¹⁸²W", "26,50%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸³W", "14,31%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁴W", "30,64%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁵W", "Synthetic", "75,1 days", "β⁻", "0,433", "¹⁸⁵Re"), arrayOf("¹⁸⁶W", "28,43%", "Stable", "Stable", "Stable", "Stable"))
            "Re"    ->  arrayOf(arrayOf("¹⁸³Re", "37,4%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁷Re", "62,6%", "4,35 x 10¹⁰ years", "α - β⁻", "1,653 - 0,003", "¹⁸³Ta - ¹⁸⁷Os"))
            "Os"    ->  arrayOf(arrayOf("¹⁸⁴Os", "0,02%", "> 5,6 x 10³ years", "εε", "1,452", "¹⁸⁴W"), arrayOf("¹⁸⁵Os", "Synthetic", "93,6 days", "ε", "1,013", "¹⁸⁵Re"), arrayOf("¹⁸⁶Os", "1,59%", "> 2 x 10¹⁵ years", "α", "2,822", "¹⁸²W"), arrayOf("¹⁸⁷Os", "1,96%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁸Os", "13,24%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁸⁹Os", "16,15%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁰Os", "26,26%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹¹Os", "Synthetic", "15,4 days", "β⁻", "0,314", "¹⁹¹Ir"), arrayOf("¹⁹²Os", "40,78%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁴Os", "Synthetic", "6 years", "β⁻", "0,097", "¹⁹⁴Ir"))
            "Ir"    ->  arrayOf(arrayOf("¹⁹¹Ir", "37,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹²Ir", "Synthetic", "73,827 days", "β⁻ - ε", "1,460 - 1,046", "¹⁹²Pt - ¹⁹²Os"), arrayOf("¹⁹³Ir", "62,7%", "Stable", "Stable", "Stable", "Stable"))
            "Pt"    ->  arrayOf(arrayOf("¹⁹⁰Pt", "0,01%", "6,5 x 10¹¹ years", "α", "3,248", "¹⁸⁶Os"), arrayOf("¹⁹¹Pt", "Synthetic", "2,76 days", "ε", "Unknown", "¹⁹¹Ir"), arrayOf("¹⁹²Pt", "0,79%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹³Pt", "Synthetic", "50 years", "ε", "0,057", "¹⁹³Ir"), arrayOf("¹⁹⁴Pt", "32,9%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁵Pt", "33,8%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁶Pt", "25,3%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁷Pt", "Synthetic", "19,8913", "β⁻", "0,719", "¹⁹⁷Au"), arrayOf("¹⁹⁸Pt", "7,2%", "Stable", "Stable", "Stable", "Stable"))
            "Au"    ->  arrayOf(arrayOf("¹⁹⁵Au", "Synthetic", "186 days", "β⁺", "0,2227", "¹⁹⁵Pt"), arrayOf("¹⁹⁷Au", "100%", "Stable", "Stable", "Stable", "Stable"))
            "Hg"    ->  arrayOf(arrayOf("¹⁹⁴Hg", "Synthetic", "444 years", "ε", "0,040", "¹⁹⁴Au"), arrayOf("¹⁹⁵Hg", "Synthetic", "9,9 hours", "ε", "0,040", "¹⁹⁵Au"), arrayOf("¹⁹⁶Hg", "0,15%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁷Hg", "Synthetic", "64,14 hours", "ε", "0,600", "¹⁹⁷Au"), arrayOf("¹⁹⁸Hg", "9,97%", "Stable", "Stable", "Stable", "Stable"), arrayOf("¹⁹⁹Hg", "16,87%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁰Hg", "23,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰¹Hg", "13,18%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰²Hg", "29,86%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁴Hg", "6,87%", "Stable", "Stable", "Stable", "Stable"))
            "Tl"    ->  arrayOf(arrayOf("²⁰³Tl", "29,524%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁴Tl", "Synthetic", "3,77 years", "β⁻ - ε", "0,761 - 0,347", "²⁰⁴Pb - ²⁰⁴Hg"), arrayOf("²⁰⁵Tl", "70,476%", "Stable", "Stable", "Stable", "Stable"))
            "Pb"    ->  arrayOf(arrayOf("²⁰²Pb", "Synthetic", "5,3 x 10⁴ years", "ε", "Unknown", "²⁰²Tl"), arrayOf("²⁰³Pb", "Synthetic", "2,162 days", "ε", "Unknown", "²⁰³Tl"), arrayOf("²⁰⁴Pb", "1,4%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁵Pb", "Synthetic", "1,53 x 10⁷ years", "ε", "0,051", "²⁰⁵Tl"), arrayOf("²⁰⁶Pb", "24,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁷Pb", "22,1%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁸Pb", "52,4%", "Stable", "Stable", "Stable", "Stable"), arrayOf("²⁰⁹Pb", "Synthetic", "3,25 hours", "β⁻", "0,051", "²⁰⁹Bi"), arrayOf("²¹⁰Pb", "Traces", "22,3 years", "α - β⁻", "3,792 - 0,064", "²⁰⁶Hg - ²¹⁰Bi"), arrayOf("²¹¹Pb", "Synthetic", "36,1 minutes", "β⁻", "0,051", "²¹¹Bi"))
            "Bi"    ->  arrayOf(arrayOf("²⁰⁷Bi", "Synthetic", "31,55 years", "ε", "2,399", "²⁰⁷Pb"), arrayOf("²⁰⁸Bi", "Synthetic", "3,368 x 10⁵ years", "ε", "2,880", "²⁰⁸Pb"), arrayOf("²⁰⁹Bi", "100%", "(2,01 ± 0,08) x 10¹⁹ years", "α", "Unknown", "²⁰⁵Tl"), arrayOf("²¹⁰Bi", "Synthetic", "5,01 days", "β⁻", "Unknown", "²¹⁰Po"))
            "Po"    ->  arrayOf(arrayOf("²⁰⁶Po", "Synthetic", "8,8 days", "α - ε", "Unknown - Unknown", "²⁰²Pb - ²'⁰⁶Bi"), arrayOf("²⁰⁷Po", "Synthetic", "5,8 hours", "ε", "Unknown", "²⁰⁷Bi"), arrayOf("²⁰⁸Po", "Synthetic", "2,898 years", "α - ε", "5,215 - 1,401", "²⁰⁴Pb - ²⁰⁸Bi"), arrayOf("²⁰⁹Po", "Synthetic", "103 years", "α - ε", "4,979 - 1,893", "²⁰⁵Pb - ²⁰⁹Bi"), arrayOf("²¹⁰P", "Traces", "138,376 days", "α", "5,407", "²⁰⁶Pb"), arrayOf("²¹¹Po", "Synthetic", "0,516 s", "α", "Unknown", "²⁰⁷Pb"), arrayOf("²¹²Po", "Synthetic", "0,298 μs - 0,299 μs", "α", "Unknown", "²⁰⁸Pb"), arrayOf("²¹³Po", "Synthetic", "4 μs", "α", "Unknown", "²⁰⁹Pb"), arrayOf("²¹⁴Po", "Synthetic", "163,7 μs", "α", "Unknown", "²¹⁰Pb"), arrayOf("²¹⁵Po", "Synthetic", "1,78 ms", "α - β⁻", "Unknown - Unknown", "²¹¹Pb - ²¹⁵At"), arrayOf("²¹⁶Po", "Synthetic", "0,145 s", "α", "Unknown", "²¹²Pb"), arrayOf("²¹⁸Po", "Synthetic", "3,10 minutes", "α - β⁻", "Unknown - Unknown", "²¹⁴Pb - ²¹⁸At"))
            "At"    ->  arrayOf(arrayOf("²⁰⁷At", "Synthetic", "1,81 hours", "ε - α", "3,910 - 5,873", "²⁰⁷Po - ²⁰³Bi"), arrayOf("²⁰⁸At", "Synthetic", "1,63 hours", "ε - α", "4,973 - 5,751", "²⁰⁸Po - ²⁰⁴Bi"), arrayOf("²⁰⁹At", "Synthetic", "5,41 hours", "ε - α", "3,486 - 5,757", "²⁰⁹Po - ²⁰⁵Bi"), arrayOf("²¹⁰At", "100%", "8,1 hours", "ε - α", "3,981 - 5,631", "²¹⁰Po - ²⁰⁶Bi"), arrayOf("²¹¹At", "Synthetic", "7,214 hours", "ε - α", "0,786 - 5,982", "²¹¹Po - ²⁰⁷Bi"), arrayOf("²¹³At", "Synthetic", "0,125 μs", "α", "9,254", "²⁰⁹Bi"), arrayOf("²¹⁵At", "Synthetic", "0,1 ms", "α", "8,178", "²¹¹Bi"), arrayOf("²¹⁸At", "Synthetic", "1,6 s", "β - α", "2,883 - 6,874", "²¹⁸Rn - ²¹⁴Bi"), arrayOf("²¹⁹At", "Synthetic", "56 s", "β - α", "1,700 - 6,390", "²¹⁹Rn - ²¹⁵Bi"), arrayOf("²²⁰At", "Synthetic", "3,71 minutes", "β - α", "3,650 - 6,050", "²²⁰Rn - ²¹⁶Bi"))
            "Rn"    ->  arrayOf(arrayOf("²¹¹Rn", "Synthetic", "14,6 hours", "ε - β⁺ - α", "2,892 - Unknown - 5,965", "²¹¹At - ²¹¹At - ²⁰⁷Po"), arrayOf("²¹²Rn", "Synthetic", "24 minutes", "α", "Unknown", "²⁰⁸Po"), arrayOf("²¹⁷Rn", "Synthetic", "0,6 ms", "α", "Unknown", "²¹³Po"), arrayOf("²¹⁹Rn", "Traces", "3,96 s", "α", "Unknown", "²¹⁵Po"), arrayOf("²²⁰Rn", "Traces", "55,61 s", "α", "6,404", "²¹⁶Po"), arrayOf("²²²Rn", "100%", "3,824 days", "α", "5,590", "²¹⁸Po"))
            "Fr"    ->  arrayOf(arrayOf("²²¹Fr", "Synthetic", "4,8 minutes", "α", "6,457", "²¹⁷At"), arrayOf("²²²Fr", "Synthetic", "14,2 minutes", "β⁻", "2,033", "²²²Ra"), arrayOf("²²³Fr", "100%", "22 minutes", "β⁻ - α", "1,149 - 5,430", "²²³Ra - ²¹⁹At"))
            "Ra"    ->  arrayOf(arrayOf("²²²Ra", "Synthetic", "38,0 s", "α", "Unknown", "²¹⁸Rn"), arrayOf("²²³Ra", "Synthetic", "11,435 days", "α", "5,99", "²¹⁹Rn"), arrayOf("²²⁴Ra", "Synthetic", "3,66 days", "α", "5,789", "²²⁰Rn"), arrayOf("²²⁵Ra", "Synthetic", "14,9 days", "β⁻", "Unknown", "²²⁵Ac"), arrayOf("²²⁶Ra", "100%", "1602 years", "α", "4,871", "²²²Rn"), arrayOf("²²⁸Ra", "Synthetic", "5,75 years", "β⁻", "0,046", "²²⁸Ac"))
            "Ac"    ->  arrayOf(arrayOf("²²⁵Ac", "Synthetic", "10 days", "α", "5,935", "²²¹Fr"), arrayOf("²²⁶Ac", "Synthetic", "29,37 hours", "β⁻ - ε - α", "1,117 - 0,640 - 5,536", "²²⁶Th - ²²⁶Ra - ²²²Fr"), arrayOf("²²⁷Ac", "100%", "21,773 years", "β⁻ - α", "0,045 - 5,042", "²²⁷Th - ²²³Fr"))
            "Th"    ->  arrayOf(arrayOf("²²⁶Th", "Synthetic", "30,6 mesi", "α", "Unknown", "²²²Ra"), arrayOf("²²⁷Th", "Synthetic", "18,72 days", "α", "Unknown", "²²³Ra"), arrayOf("²²⁸Th", "Synthetic", "1,9116 years", "α", "5,520", "²²⁴Ra"), arrayOf("²²⁹Th", "Synthetic", "7340 years", "α", "5,168", "²²⁵Ra"), arrayOf("²³⁰Th", "Synthetic", "75380 years", "α", "4,770", "²²⁶Ra"), arrayOf("²³¹Th", "Synthetic", "25,5 hours", "β⁻", "0,39", "²³¹Pa"), arrayOf("²³²Th", "100%", "1,405 x 10¹⁰ years", "α", "4,083", "²²⁸Ra"), arrayOf("²³³Th", "Synthetic", "21,83 minutes", "β⁻", "Unknown", "²³³Pa"), arrayOf("²³⁴Th", "Synthetic", "24,1 days", "β⁻", "0,27", "²³⁴Pa"))
            "Pa"    ->  arrayOf(arrayOf("²²⁹Pa", "Synthetic", "1,4 days", "α", "5,58", "²²⁵Ac"), arrayOf("²³⁰Pa", "Synthetic", "17,4 days", "ε - β⁻", "1,310 - 0,563", "²³⁰Th - ²³⁰U"), arrayOf("²³¹Pa", "100%", "32760 years", "α", "5,149", "²²⁷Ac"), arrayOf("²³³Pa", "Synthetic", "26,967 days", "β⁻", "0,571", "²³³U"), arrayOf("²³⁴Pa", "Synthetic", "6,75 hours", "β⁻", "0,23", "²³⁴U"))
            "U"     ->  arrayOf(arrayOf("²³⁰U", "Synthetic", "20,8 days", "α", "Unknown", "²²⁶Th"), arrayOf("²³¹U", "Synthetic", "4,28 days", "ε", "Unknown", "²³¹Pa"), arrayOf("²³²U", "Synthetic", "68,9 years", "α - Fission", "5,414", "²²⁸Th"), arrayOf("²³³U", "Synthetic", "159200 years", "α - Fission", "4,909 - 197,93", "²²⁹Th"), arrayOf("²³⁴U", "0,005%", "245500 years", "α - Fission", "4,859 - 197,78", "²³⁰Th"), arrayOf("²³⁵U", "0,72%", "7,038 x 10⁸ years", "α - Fission", "4,679 - 202,48", "²³¹Th"), arrayOf("²³⁶U", "Synthetic", "2,342 x 10⁷ years", "α - Fission", "4,572 - 201,82", "²³²Th"), arrayOf("²³⁷U", "Synthetic", "6,75 days", "β", "Unknown", "²³⁷Np"), arrayOf("²³⁸U", "99,257%", "4,468 x 10⁹ years", "α - Fission", "4,270 - 205,87", "²³⁴Th"), arrayOf("²³⁹U", "Synthetic", "23 minutes", "β", "Unknown", "²³⁹Np"), arrayOf("²⁴⁰U", "Synthetic", "14,1 hours", "β", "Unknown", "²⁴⁰Np"))
            "Np"    ->  arrayOf(arrayOf("²³⁵Np", "Synthetic", "369,1 days", "α - ε", "5,192 - 0,124", "²³¹Pa - ²³⁵U"), arrayOf("²³⁶Np", "Synthetic", "1,54 x 10⁵ years", "ε - β⁻ - α", "0,940 - 0,940 - 5,020", "²³⁶U - ²³⁶Pu - ²³²Pa"), arrayOf("²³⁷Np", "Traces", "2,144 x 10⁶ years", "α - Fission", "4,959", "²³²Pa"), arrayOf("²³⁹Np", "Synthetic", "2,355 days", "β⁻", "Unknown", "²³⁹Pu"))
            "Pu"    ->  arrayOf(arrayOf("²³⁸Pu", "Synthetic", "87,74 years", "α - Fission", "5,5 - 204,66", "²³⁴U"), arrayOf("²³⁹Pu", "Traces", "2,41 x 10⁴ years", "α - Fission", "5,245 - 207,06", "²³⁵U"), arrayOf("²⁴⁰Pu", "Synthetic", "6,5 x 10³ years", "α - Fission", "5,256 - 205,66", "²³⁶U"), arrayOf("²⁴¹Pu", "Synthetic", "14 years", "β⁻ - Fission", "0,02078 - 210,83", "²⁴¹Am"), arrayOf("²⁴²Pu", "Synthetic", "3,73 x 10⁵ years", "α - Fission", "4,984 - 209,47", "²³⁸U"), arrayOf("²⁴⁴Pu", "Synthetic", "8,08 x 10⁷ years", "α - Fission", "4,666", "²⁴⁰U"))
            "Am"    ->  arrayOf(arrayOf("²⁴¹Am", "Synthetic", "432,2 years", "α - Fission", "5,486", "²³⁷Np"), arrayOf("²⁴³Am", "Synthetic", "7370 years", "α - Fission", "5,275", "²³⁹Np"))
            "Cm"    ->  arrayOf(arrayOf("²⁴²Cm", "Synthetic", "160 days", "α - Fission", "6,1", "²³⁸Pu"), arrayOf("²⁴³Cm", "Synthetic", "29,1 years", "α - ε - Fission", "6,169 - 0,009", "²³⁹Pu - ²⁴³Am"), arrayOf("²⁴⁴Cm", "Synthetic", "18,1 years", "α - Fission", "5,902", "²⁴⁰Pu"), arrayOf("²⁴⁵Cm", "Synthetic", "8500 years", "α - Fission", "5,623", "²⁴¹Pu"), arrayOf("²⁴⁶Cm", "Sinteico", "4730 years", "α - Fission", "5,475", "²⁴²Pu"), arrayOf("²⁴⁷Cm", "Synthetic", "1,56 x 10⁷ years", "α", "5,353", "²⁴³Pu"), arrayOf("²⁴⁸Cm", "Synthetic", "3,4 x 10⁵ years", "α - Fission", "5,162", "²⁴⁴Pu"), arrayOf("²⁵⁰Cm", "Synthetic", "9000 years", "α - β⁻ - Fission", "5,162 - 0,037", "²⁴⁶Pu - ²⁵⁰Bk"))
            "Bk"    ->  arrayOf(arrayOf("²⁴⁵Bk", "Synthetic", "160 days", "ε - α", "0,180 - 6,455", "²⁴⁵Cm - ²⁴¹Am"), arrayOf("²⁴⁶Bk", "Synthetic", "1,8 days", "α - ε", "6,070 - 1,350", "²⁴²Am - ²⁴⁶Cm"), arrayOf("²⁴⁷Bk", "Synthetic", "1380 years", "α", "5,889", "²⁴³Am"), arrayOf("²⁴⁸Bk", "Synthetic", "> 9 years", "α", "5,803", "²⁴⁴Am"), arrayOf("²⁴⁹Bk", "Synthetic", "320 days", "α - β⁻ - Fission", "5,475 - 0,125", "²⁴⁵Am - ²⁴⁹Cf"))
            "Cf"    ->  arrayOf(arrayOf("²⁴⁸Cf", "Synthetic", "333,5 days", "α - Fission", "6,361", "²⁴⁴Cm"), arrayOf("²⁴⁹Cf", "Synthetic", "351 years", "α - Fission", "6,295", "²⁴⁵Cm"), arrayOf("²⁵⁰Cf", "Synthetic", "13,08 years", "α - Fission", "6,128", "²⁴⁶Cm"), arrayOf("²⁵¹Cf", "Synthetic", "898 years", "α", "6,176", "²⁴⁷Cm"), arrayOf("²⁵²Cf", "Synthetic", "2,645 years", "α - Fission", "6,217", "²⁴⁸Cm"), arrayOf("²⁵³Cf", "Synthetic", "17,81 days", "β⁻ - α", "0,285 - 6,124", "²⁵³Es - ²⁴⁴Cm"), arrayOf("²⁵⁴Cf", "Synthetic", "60,5 days", "α - Fission", "5,926", "²⁵⁰Cm"))
            "Es"    ->  arrayOf(arrayOf("²⁵²Es", "Synthetic", "471,7 days", "α - ε - β⁻", "6,760 - 1,260 - 0,480", "²⁴⁸Bk - ²⁵²Cf - ²⁵²Fm"), arrayOf("²⁵³Es", "Synthetic", "20,47 days", "α - Fission", "6,739", "²⁴⁹Bk"), arrayOf("²⁵⁴Es", "Synthetic", "275,7 days", "ε - β⁻ - α", "0,654 - 1,090 - 6,628", "²⁵⁴Cf - ²⁵⁴Fm - ²⁵⁰Bk"), arrayOf("²⁵⁵Es", "Synthetic", "39,8 days", "β⁻ - α - Fission", "0,288 - 6,436", "²⁵⁵Fm - ²⁵¹Bk"))
            "Fm"    ->  arrayOf(arrayOf("²⁵²Fm", "Synthetic", "25,39 hours", "α - Fission", "7,153", "²⁴⁸Cf"), arrayOf("²⁵³Fm", "Synthetic", "3 days", "ε - α", "0,333 - 7,197", "²⁵³Es - ²⁴⁹Cf"), arrayOf("²⁵⁵Fm", "Synthetic", "20,07 hours", "α - Fission", "7,241", "²⁵¹Cf"), arrayOf("²⁵⁷Fm", "Synthetic", "100,5 days", "α - Fission", "6,864", "²⁵³Cf"))
            "Md"    ->  arrayOf(arrayOf("²⁵⁷Md", "Synthetic", "5,52 hours", "ε - α - Fission", "0,406 - 7,558", "²⁵⁷Fm - ²⁵³Es"), arrayOf("²⁵⁸Md", "Synthetic", "51,5 days", "ε", "1,230", "²⁵⁸Fm"), arrayOf("²⁶⁰Md", "Synthetic", "31,8 days", "α - ε - β⁻ - Fission", "7,000 - Unknown - 1,000", "²⁵⁶Es - ²⁶⁰Fm - ²⁶⁰No"))
            "No"    ->  arrayOf(arrayOf("²⁵³No", "Synthetic", "1,7 minutes", "α - ε", "8,440 - 3,200", "²⁴⁹Fm - ²⁵³Md"), arrayOf("²⁵⁵No", "Synthetic", "3,1 minutes", "α - ε", "8,445 - 2,012", "²⁵¹Fm - ²⁵⁵Md"), arrayOf("²⁵⁹No", "Synthetic", "3,1 minutes", "α - ε - Fission", "7,910 - 0,500", "²⁵⁵Fm - ²⁵⁹Md"))
            "Lr"    ->  arrayOf(arrayOf("²⁶²Lr", "Synthetic", "3,6 hours", "ε", "Unknown", "²⁶²No"), arrayOf("²⁶⁶Lr", "Synthetic", "11 hours", "Spontaneous fission", "Unknown", "Vario"))
            "Rf"    ->  arrayOf(arrayOf("²⁶¹Rf", "Synthetic", "70 s", "α - ε - Fission", "Unknown", "²⁵⁷No - ²⁶¹Lr"), arrayOf("²⁶³Rf", "Synthetic", "15 minutes", "α - Fission", "Unknown", "²⁵⁹No"), arrayOf("²⁶⁵Rf", "Synthetic", "1,1 minutes", "Fission", "Unknown", "Unknown"), arrayOf("²⁶⁶Rf", "Synthetic", "23 s", "Fission", "Unknown", "Unknown"), arrayOf("²⁶⁶Rf", "Synthetic", "1,3 hours", "Fission", "Unknown", "Unknown"))
            "Db"    ->  arrayOf(arrayOf("²⁶²Db", "Synthetic", "34 s", "α - Fission", "Unknown", "²⁵⁸Lr"), arrayOf("²⁶³DbDb", "Synthetic", "27 s", "α - Fission", "Unknown", "²⁵⁹Lr"), arrayOf("²⁶⁶Db", "Synthetic", "20 minutes", "ε? - Fission", "Unknown", "²⁶⁶Rf"), arrayOf("²⁶⁷DbDb", "Synthetic", "1,2 hours", "ε? - Fission", "Unknown", "²⁶⁷Rf"), arrayOf("²⁶⁸Db", "Synthetic", "28 hours", "ε? - α - Fission", "Unknown", "²⁶⁸Rf - ²⁶⁴Lr"), arrayOf("²⁷⁰Db", "Synthetic", "15 hours", "α - ε? - Fission", "Unknown", "²⁶⁶Lr - ²⁷⁰Rf"))
            "Sg"    ->  arrayOf(arrayOf("²⁶⁵Sg", "Synthetic", "8,9 s", "α", "Unknown", "²⁶¹Rf"), arrayOf("²⁶⁷Sg", "Synthetic", "1,4 minutes", "α - Fission", "Unknown", "²⁶³Rf"), arrayOf("²⁶⁹Sg", "Synthetic", "14 minutes", "α", "Unknown", "²⁶⁵Rf"), arrayOf("²⁷¹Sg", "Synthetic", "1,6 minutes", "α - Fission", "Unknown", "²⁶⁷Rf"))
            "Bh"    ->  arrayOf(arrayOf("²⁶⁰Bh", "Synthetic", "35 ms", "α", "10,16", "²⁵⁶Db"), arrayOf("²⁶¹Bh", "Synthetic", "11,8 ms", "α", "10,10", "²⁵⁷Db"), arrayOf("²⁶⁴Bh", "Synthetic", "0,97 s", "α", "9,62 - 9,48", "²⁶⁰Db"), arrayOf("²⁶⁵Bh", "Synthetic", "0,9 s", "α", "9,24", "²⁶¹Db"), arrayOf("²⁶⁶Bh", "Synthetic", "0,9 s", "α", "9,77 - 9,04", "²⁶²Db"), arrayOf("²⁶⁷Bh", "Synthetic", "17 s", "α", "8,83", "²⁶³Db"), arrayOf("²⁷⁰Bh", "Synthetic", "61 s", "α", "8,93", "²⁶⁶Db"), arrayOf("²⁷²Bh", "Synthetic", "9,8 s", "α", "9,02", "²⁶⁸Db"), arrayOf("²⁷⁴Bh", "Synthetic", "~53 s", "α", "8,93", "²⁷⁰Db"))
            "Hs"    ->  arrayOf(arrayOf("²⁶³Hs", "Synthetic", "0,74 ms", "α", "10,89 - 10,72 - 10,57", "²⁵⁹Sg"), arrayOf("²⁶⁴Hs", "Synthetic", "~0,8 ms", "α", "10,43", "²⁶⁰Sg"), arrayOf("²⁶⁴Hs", "Synthetic", "0,8 ms", "Fission", "Unknown", "Unknown"), arrayOf("²⁶⁵Hs", "Synthetic", "2,0 ms", "α", "Unknown", "²⁶¹Sg"), arrayOf("²⁶⁷Hs", "Synthetic", "2,3 ms", "α", "10,18", "²⁶²Sg"), arrayOf("²⁶⁸Hs", "Synthetic", "0,36 s", "α", "9,48", "²⁶⁴Sg"), arrayOf("²⁶⁹Hs", "Synthetic", "9,7 s", "α", "9,21 - 9,10 - 8,97", "²⁶⁵Sg"), arrayOf("²⁷⁰Hs", "Synthetic", "3,6 s", "α", "9,02 - 8,88", "²⁶⁶Sg"))
            "Mt"    ->  arrayOf(arrayOf("²⁷⁴Mt", "Synthetic", "0,4 s", "α", "Unknown", "²⁷⁰Bh"), arrayOf("²⁷⁶Mt", "Synthetic", "0,6 s", "α", "Unknown", "²⁷²Bh"), arrayOf("²⁷⁸Mt", "Synthetic", "4 s", "α", "Unknown", "²⁷⁴Bh"), arrayOf("²⁸²Mt", "Synthetic", "67 s?", "α", "Unknown", "²⁷⁸Bh"))
            "Ds"    ->  arrayOf(arrayOf("²⁷⁹Ds", "Synthetic", "0,20 s", "α - Fission", "9,70", "²⁷⁵Hs"), arrayOf("²⁷³Ds", "Synthetic", "170 ms", "α", "11,14", "²⁶⁹Hs"), arrayOf("²⁶⁹Ds", "Synthetic", "0,17 ms", "α", "11,11", "²⁶⁵Hs"))
            "Rg"    ->  arrayOf(arrayOf("²⁷²Rg", "Synthetic", "1,6 ms", "α", "11,02 - 10,82", "²⁶⁸Mt"), arrayOf("²⁷⁴Rg", "Synthetic", "15 ms", "α", "11,23", "²⁷⁰Mt"), arrayOf("²⁷⁸Rg", "Synthetic", "4,2 ms", "α", "10,69", "²⁷⁴Mt"), arrayOf("²⁷⁹Rg", "Synthetic", "170 ms", "α", "10,37", "²⁷⁵Mt"), arrayOf("²⁸⁰Rg", "Synthetic", "3,6 s", "α", "9,75", "²⁷⁶Mt"), arrayOf("²⁸¹Rg", "Synthetic", "22,8 s", "Fission", "Unknown", "Unknown"), arrayOf("²⁸²Rg", "Synthetic", "~0,5 s", "α", "9,00", "²⁷⁸Mt"))
            "Cn"    ->  arrayOf(arrayOf("²⁷⁷Cn", "Synthetic", "0,69 ms", "α", "Unknown", "²⁷³Ds"), arrayOf("²⁸¹Cn", "Synthetic", "0,18 s", "α", "Unknown", "²⁷⁷Ds"), arrayOf("²⁸²Cn", "Synthetic", "0.91 ms", "Fission", "Unknown", "Unknown"), arrayOf("²⁸³Cn", "Synthetic", "4,2 s", "α - ε? - Fission", "Unknown", "²⁷⁹Ds - ²⁸³Rg"), arrayOf("²⁸⁴Cn", "Unknown", "98 ms", "α - Fission", "Unknown", "²⁸⁰Ds"), arrayOf("²⁸⁵Cn", "Synthetic", "28 s", "α", "Unknown", "²⁸¹Ds"), arrayOf("²⁸⁶Cn", "Synthetic", "8,45 s?", "Fission", "Unknown", "Unknown"))
            "Nh"    ->  arrayOf(arrayOf("²⁷⁸Nh", "Synthetic", "1,4 ms", "α", "Unknown", "²⁷⁴Rg"), arrayOf("²⁸²Nh", "Synthetic", "73 ms", "α", "Unknown", "²⁷⁸Rg"), arrayOf("²⁸³Nh", "Synthetic", "75 ms", "α", "Unknown", "²⁷⁹Rg"), arrayOf("²⁸⁴Nh", "Synthetic", "0,91 s", "α - ε", "Unknown", "²⁸⁰Rg - ²⁸⁴Cn"), arrayOf("²⁸⁵Nh", "Synthetic", "4,2 s", "α", "Synthetic", "²⁸¹Rg"), arrayOf("²⁸⁶Nh", "Synthetic", "9,5 s", "α", "Unknown", "²⁸²Rg"), arrayOf("²⁸⁷Nh", "Synthetic", "5,5 s?", "α", "Unknown", "²⁸³Rg"), arrayOf("²⁹⁰Nh", "Sinteico", "2 s?", "α", "Unknown", "²⁸⁶Rg"))
            "Fl"    ->  arrayOf(arrayOf("²⁸⁴Fl", "Synthetic", "2,5 ms", "Fission", "Unknown", "Unknown"), arrayOf("²⁸⁵Fl", "Synthetic", "~0,1 s", "α", "Unknown", "²⁸¹Cn"), arrayOf("²⁸⁶Fl", "Synthetic", "~0,12 s", "α - Fission", "Unknown", "Unknown"), arrayOf("²⁸⁷Fl", "Synthetic", "~0,5 s", "α", "Unknown", "²⁸³Cn"), arrayOf("²⁸⁸Fl", "Synthetic", "~0,7 s", "α", "Unknown", "²⁸⁴Cn"), arrayOf("²⁸⁹Fl", "Synthetic", "~2 s", "α", "Synthetic", "²⁸⁵Cn"), arrayOf("²⁹⁰Fl", "Synthetic", "19 s?", "α - ε", "Unknown", "²⁸⁶Cn - ²⁹⁰Nh"))
            "Mc"    ->  arrayOf(arrayOf("²⁸⁶Mc", "Synthetic", "20 ms", "α", "Unknown", "²⁸²Nh"), arrayOf("²⁸⁷Mc", "Synthetic", "37 ms", "α", "Unknown", "²⁸³Nh"), arrayOf("²⁸⁸Mc", "Synthetic", "164 ms", "α", "Unknown", "²⁸⁴Nh"), arrayOf("²⁸⁹Mc", "Synthetic", "330 ms", "α", "Unknown", "²⁸⁵Nh"), arrayOf("²⁹⁰Mc", "Synthetic", "650 ms", "α", "Unknown", "²⁸⁶Nh"))
            "Lv"    ->  arrayOf(arrayOf("²⁹⁰Lv", "Synthetic", "8,3 ms", "α", "Unknown", "²⁸⁶Fl"), arrayOf("²⁹¹Lv", "Synthetic", "19 ms", "α", "Unknown", "²⁸⁷Fl"), arrayOf("²⁹²Lv", "Synthetic", "13 ms", "α", "Unknown", "²⁸⁸Fl"), arrayOf("²⁹³Lv", "Synthetic", "57 ms", "α", "Unknown", "²⁸⁹Fl"), arrayOf("²⁹⁴Lv", "Synthetic", "54 ms?", "α", "Unknown", "²⁹⁰Fl"))
            "Ts"    ->  arrayOf(arrayOf("²⁹³Ts", "Synthetic", "14,2 ms", "α", "11,11 - 11,00 - 10,91", "²⁸⁹Mc"), arrayOf("²⁹⁴Ts", "Synthetic", "77,9 ms", "α", "10,81", "²⁹⁰Mc"))
            "Og"    ->  arrayOf(arrayOf("²⁹⁴Og", "Synthetic", "~0,89 ms", "α", "0,231", "²⁹⁰Lv"))
            else    ->  arrayOf()
        }
    }
}