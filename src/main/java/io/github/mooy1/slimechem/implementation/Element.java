package io.github.mooy1.slimechem.implementation;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.annotation.Nonnull;

@Getter
@AllArgsConstructor
public enum Element {

    HYDROGEN(1.0079, "Hydrogen", "H", 1),
    HELIUM(4.0026, "Helium", "He", 2),
    LITHIUM(6.941, "Lithium", "Li", 3),
    BERYLLIUM(9.0122, "Beryllium", "Be", 4),
    BORON(10.811, "Boron", "B", 5),
    CARBON(12.0107, "Carbon", "C", 6),
    NITROGEN(14.0067, "Nitrogen", "N", 7),
    OXYGEN(15.9994, "Oxygen", "O", 8),
    FLUORINE(18.9984, "Fluorine", "F", 9),
    NEON(20.1797, "Neon", "Ne", 10),
    SODIUM(22.9897, "Sodium", "Na", 11),
    MAGNESIUM(24.305, "Magnesium", "Mg", 12),
    ALUMINUM(26.9815, "Aluminum", "Al", 13),
    SILICON(28.0855, "Silicon", "Si", 14),
    PHOSPHORUS(30.9738, "Phosphorus", "P", 15),
    SULFUR(32.065, "Sulfur", "S", 16),
    CHLORINE(35.453, "Chlorine", "Cl", 17),
    POTASSIUM(39.0983, "Potassium", "K", 19),
    ARGON(39.948, "Argon", "Ar", 18),
    CALCIUM(40.078, "Calcium", "Ca", 20),
    SCANDIUM(44.9559, "Scandium", "Sc", 21),
    TITANIUM(47.867, "Titanium", "Ti", 22),
    VANADIUM(50.9415, "Vanadium", "V", 23),
    CHROMIUM(51.9961, "Chromium", "Cr", 24),
    MANGANESE(54.938, "Manganese", "Mn", 25),
    IRON(55.845, "Iron", "Fe", 26),
    NICKEL(58.6934, "Nickel", "Ni", 28),
    COBALT(58.9332, "Cobalt", "Co", 27),
    COPPER(63.546, "Copper", "Cu", 29),
    ZINC(65.39, "Zinc", "Zn", 30),
    GALLIUM(69.723, "Gallium", "Ga", 31),
    GERMANIUM(72.64, "Germanium", "Ge", 32),
    ARSENIC(74.9216, "Arsenic", "As", 33),
    SELENIUM(78.96, "Selenium", "Se", 34),
    BROMINE(79.904, "Bromine", "Br", 35),
    KRYPTON(83.8, "Krypton", "Kr", 36),
    RUBIDIUM(85.4678, "Rubidium", "Rb", 37),
    STRONTIUM(87.62, "Strontium", "Sr", 38),
    YTTRIUM(88.9059, "Yttrium", "Y", 39),
    ZIRCONIUM(91.224, "Zirconium", "Zr", 40),
    NIOBIUM(92.9064, "Niobium", "Nb", 41),
    MOLYBDENUM(95.94, "Molybdenum", "Mo", 42),
    TECHNETIUM(98, "Technetium", "Tc", 43),
    RUTHENIUM(101.07, "Ruthenium", "Ru", 44),
    RHODIUM(102.9055, "Rhodium", "Rh", 45),
    PALLADIUM(106.42, "Palladium", "Pd", 46),
    SILVER(107.8682, "Silver", "Ag", 47),
    CADMIUM(112.411, "Cadmium", "Cd", 48),
    INDIUM(114.818, "Indium", "In", 49),
    TIN(118.71, "Tin", "Sn", 50),
    ANTIMONY(121.76, "Antimony", "Sb", 51),
    IODINE(126.9045, "Iodine", "I", 53),
    TELLURIUM(127.6, "Tellurium", "Te", 52),
    XENON(131.293, "Xenon", "Xe", 54),
    CESIUM(132.9055, "Cesium", "Cs", 55),
    BARIUM(137.327, "Barium", "Ba", 56),
    LANTHANUM(138.9055, "Lanthanum", "La", 57),
    CERIUM(140.116, "Cerium", "Ce", 58),
    PRASEODYMIUM(140.9077, "Praseodymium", "Pr", 59),
    NEODYMIUM(144.24, "Neodymium", "Nd", 60),
    PROMETHIUM(145, "Promethium", "Pm", 61),
    SAMARIUM(150.36, "Samarium", "Sm", 62),
    EUROPIUM(151.964, "Europium", "Eu", 63),
    GADOLINIUM(157.25, "Gadolinium", "Gd", 64),
    TERBIUM(158.9253, "Terbium", "Tb", 65),
    DYSPROSIUM(162.5, "Dysprosium", "Dy", 66),
    HOLMIUM(164.9303, "Holmium", "Ho", 67),
    ERBIUM(167.259, "Erbium", "Er", 68),
    THULIUM(168.9342, "Thulium", "Tm", 69),
    YTTERBIUM(173.04, "Ytterbium", "Yb", 70),
    LUTETIUM(174.967, "Lutetium", "Lu", 71),
    HAFNIUM(178.49, "Hafnium", "Hf", 72),
    TANTALUM(180.9479, "Tantalum", "Ta", 73),
    TUNGSTEN(183.84, "Tungsten", "W", 74),
    RHENIUM(186.207, "Rhenium", "Re", 75),
    OSMIUM(190.23, "Osmium", "Os", 76),
    IRIDIUM(192.217, "Iridium", "Ir", 77),
    PLATINUM(195.078, "Platinum", "Pt", 78),
    GOLD(196.9665, "Gold", "Au", 79),
    MERCURY(200.59, "Mercury", "Hg", 80),
    THALLIUM(204.3833, "Thallium", "Tl", 81),
    LEAD(207.2, "Lead", "Pb", 82),
    BISMUTH(208.9804, "Bismuth", "Bi", 83),
    POLONIUM(209, "Polonium", "Po", 84),
    ASTATINE(210, "Astatine", "At", 85),
    RADON(222, "Radon", "Rn", 86),
    FRANCIUM(223, "Francium", "Fr", 87),
    RADIUM(226, "Radium", "Ra", 88),
    ACTINIUM(227, "Actinium", "Ac", 89),
    THORIUM(232.0381, "Thorium", "Th", 90),
    PROTACTINIUM(231.0359, "Protactinium", "Pa", 91),
    URANIUM(238.0289, "Uranium", "U", 92),
    NEPTUNIUM(237, "Neptunium", "Np", 93),
    PLUTONIUM(244, "Plutonium", "Pu", 94),
    AMERICIUM(243, "Americium", "Am", 95),
    CURIUM(247, "Curium", "Cm", 96),
    BERKELIUM(247, "Berkelium", "Bk", 97),
    CALIFORNIUM(251, "Californium", "Cf", 98),
    EINSTEINIUM(252, "Einsteinium", "Es", 99),
    FERMIUM(257, "Fermium", "Fm", 100),
    MENDELEVIUM(258, "Mendelevium", "Md", 101),
    NOBELIUM(259, "Nobelium", "No", 102),
    LAWRENCIUM(266, "Lawrencium", "Lr", 103),
    RUTHERFORDIUM(267, "Rutherfordium", "Rf", 104),
    DUBNIUM(268, "Dubnium", "Db", 105),
    SEABORGIUM(269, "Seaborgium", "Sg", 106),
    BOHRIUM(270, "Bohrium", "Bh", 107),
    HASSIUM(277, "Hassium", "Hs", 108),
    MEITNERIUM(278, "Meitnerium", "Mt", 109),
    DARMSTADTIUM(281, "Darmstadtium", "Ds", 110),
    ROENTGENIUM(282, "Roentgenium", "Rg", 111),
    COPERNICIUM(285, "Copernicium", "Cn", 112),
    NIHONIUM(286, "Nihonium", "Nh", 113),
    FLEROVIUM(289, "Flerovium", "Fl", 114),
    MOSCOVIUM(290, "Moscovium", "Mc", 115),
    LIVERMORIUM(293, "Livermorium", "Lv", 116),
    TENNESSINE(294, "Tennessine", "Ts", 117),
    OGANESSON(294, "Oganesson", "Og", 118);

    private final double atomicMass;
    @Nonnull
    private final String name;
    @Nonnull
    private final String symbol;
    private final int atomicNumber;

    public int getNeutrons() {
        return (int) Math.round(this.atomicMass) - this.atomicNumber;
    }
}
