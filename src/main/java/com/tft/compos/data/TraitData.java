/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tft.compos.data;
import com.tft.compos.model.Trait;
import java.util.*;

/**
 *
 * @author Franco
 */
public class TraitData {
    
    //Creación de sinergias
    public static final Trait arcanist = new Trait ("Arcanista", "Tu equipo obtiene poder de habilidad; los arcanólogos obtienen más.");
    public static final Trait ascendant = new Trait("Ascendente", "Tras cada combate, un amuleto ascendente aparecerá en tu tienda. Estos amuletos otorgan poderosos efectos que se pueden comprar con oro.");
    public static final Trait assimilator = new Trait ("Asimilacion", "Kai'Sa tiene una habilidad diferente en función de si tiene más daño de ataque o poder de habilidad.");
    public static final Trait bilgeWater = new Trait ("Aguasturbias" , "Obtiene monedas de plata para gastarlas en el mercado negro.");
    public static final Trait bruiser = new Trait ("Maton" , "Los matones obtienen más vida máxima");
    public static final Trait blackSmith = new Trait("Herrero", "Luego de 4 combates contra jugadores, Ornn forja un artefacto.");
    public static final Trait caretaker = new Trait ("Cuidador","Tras ganar un combate contra un jugador, obtienes una unidad aleatoria de Runaterra. Tras perder un combate, obtienes cambios de tienda gratis.");
    public static final Trait chainbreaker = new Trait ("Rompedor de cadenas","Sylas rota entre 3 habilidades diferentes, en función de cuál sea de mayor utilidad al momento.");
    public static final Trait chronokeeper = new Trait("Guardian del tiempo", "Cada 2 lanzamientos, el Guardián del tiempo almacena 1 de EXP. Si tiene EXP suficiente para que subas de nivel, te transfiere la EXP necesaria.");
    public static final Trait darkChild = new Trait("Nini   a de la oscuridad", "Annie invoca a Tibbers en el banquillo. Es posible desplegarlo, ocupa un hueco de equipo y podrás equiparle objetos de forma independiente.");
    public static final Trait darkin = new Trait("Darkin","(1) los Darkin obtienen un 15% de omnisucción. (2) Y te curas un 25% del daño de jugador que inflijas. (3) Y siempre que los Oscuros restauren 600 de vida, infligen 333 de daño mágico a los 2 enemigos más cercanos.");
    public static final Trait defender = new Trait("Defensor", "Tu equipo obtiene 12 de armadura y resistencia mágica. Los defensores obtienen más.");
    public static final Trait demacia = new Trait("Demacia", "Cada vez que tu equipo pierde un 25% de la vida máxima, los demacianos se reúnen, lo que reduce un 10% sus costes de maná. Los demacianos obtienen armadura y resistencia mágica.");
    public static final Trait disruptor = new Trait("Disruptor", "Las habilidades de los disruptores desorientan a los enemigos alcanzados. Los disruptores infligen daño adicional a los enemigos desorientados.");
    public static final Trait dragonborn = new Trait("Hija del dragon", "Tras el lanzamiento, Shyvana reemplaza su habilidad por Aliento de fuego. Mientras está transformada, todos los aliados reciben un 8% menos de daño de las habilidades enemigas.");
    public static final Trait emperor = new Trait("Imperial", "Azir despliega dos guardias que se pueden colocar en cualquier lugar del campo de batalla");
    public static final Trait eternal = new Trait("Eterno", "Cada tres ataques de Kindred a un mismo enemigo, inflige un 325% de daño mientras Lobo ataca al objetivo.");
    public static final Trait freljord = new Trait("Freljord", "Invoca una torreta congelada. Los aliados frente a ella obtienen vida, y los que estén detrás, amplificación de daño. Los freljordianos obtienen un 150% más.");
    public static final Trait glutton = new Trait("Gloton", "Una vez por fase de planificación, puedes alimentar a Tahm Kench con un campeón, que le otorga vida, velocidad de ataque o poder de habilidad de forma permanente en función de su rol y su nivel de estrellas.");
    public static final Trait gunslinger = new Trait("Pistolero", "Los pistoleros obtienen daño de ataque. Cada 4 ataques, los pistoleros infligen daño físico adicional.");
    public static final Trait harvester = new Trait ("Cosechador","Cada vez que un campeón enemigo muere, obtiene 10 de maná. Lanzar habilidades no consume maná.");
    public static final Trait heroic = new Trait("Heroico", "Galio no se puede desplegar en combate. Su atributo cuenta desde el banquillo, y cuando los demacianos se reúnen, se une al combate.");
    public static final Trait hexMech = new Trait("Mecha Hextech", "Obtienes 1 piloto hextech. Comienzo del combate: La unidad en su interior se sube al T-Hex, lo que le otorga un 80% de su vida y estadísticas adicionales en función de su rol y nivel de estrellas.");
    public static final Trait huntress = new Trait("Cazadora", "Mientras tu Neeko más fuerte esté viva, tu Nidalee más fuerte no podrá ser objetivo de ataques básicos, y además obtiene un 50% de durabilidad.");
    public static final Trait immortal = new Trait("Inmortal", "Mientras Xin Zhao no esté en tu tablero, Zaahen obtiene los atributos Jonia, Demacia y Guardián.");
    public static final Trait invoker = new Trait("Conjurador", "Tu equipo obtiene 1 de regeneración de maná. Los conjuradores obtienen más maná de todas las fuentes.");
    public static final Trait ionia = new Trait("Jonia", "Los jonios obtienen un escudo, daño de ataque y poder de habilidad. Cada partida, recorren un camino distinto.");
    public static final Trait ixtal = new Trait("Ixtal", "Cumple misiones durante el combate para recibir botines adicionales");
    public static final Trait juggernaut = new Trait("Coloso", "Los colosos obtienen durabilidad, que aumenta con más del 50% de vida. Cuando un coloso muere, los demás colosos se curan un 5% de su vida máxima.");
    public static final Trait longshot = new Trait("Tirolargo", "Las unidades de Tiro largo obtienen amplificación de daño e infligen más daño a los enemigos más alejados.");
    public static final Trait noxus = new Trait("Noxus", "Cuando el equipo enemigo ha perdido un 15% de su vida, invoca a Atakhan, el Portador de la Ruina. Cada nivel de estrellas de los campeones noxianos aumenta su poder.");
    public static final Trait piltover = new Trait("Piltover", "Construye un invento en la parte derecha del tablero. Tras 8 s, el invento se activa y da rienda suelta a cada uno de sus módulos.");         
    public static final Trait quickstriker = new Trait("Ataque relámpago", "Tu equipo obtiene un 15% de velocidad de ataque. Los ataquerelámpago obtienen velocidad de ataque adicional según la vida que le falte a su objetivo.");
    public static final Trait riftcourge = new Trait("Azote de la grieta", "El Barón Nashor ocupa dos huecos del equipo, pero da +2 al atributo del Vacío.");
    public static final Trait runeMage = new Trait("Mago runico", "El mago rúnico se beneficia de todos los atributos de región, pero no contribuye a ninguno.");
    public static final Trait shadowIsles= new Trait("Isla de las sombras", "Cada vez que un campeón muere en un combate contra un jugador, obtienes almas. Las habilidades de los campeones de las Islas de la Sombra se potencian de forma única en función del número de almas que tengas. Los campeones de las Islas de la Sombra obtienen daño de ataque y poder de habilidad.");
    public static final Trait shurima = new Trait("Shurima", "Cada segundo, los shurimanos obtienen un 2% de velocidad de ataque y restauran 20 de vida. Al comienzo del combate, obtienen efectos adicionales.");
    public static final Trait slayer = new Trait("Fulminador", "Los verdugos obtienen omnivampirismo y daño de ataque. Aumenta el daño de ataque adicional hasta un 50%, según la vida que les falte.");
    public static final Trait soulbound = new Trait ("Vinculo", "Lucian y Senna luchan juntos, intercambiándose cada vez que uno lanza su habilidad.");
    public static final Trait starForger = new Trait ("Forjador de estrellas","Aurelion Sol obtiene un 25/30/100% de polvo estelar adicional por cada otro targoniano único desplegado en combate.");
    public static final Trait targon = new Trait("Targón", "Las estrellas forjaron a los campeones de Targon. No tienen atributo alguno, pero son más fuertes que los campeones normales.");
    public static final Trait theBoss = new Trait("El jefe", "La primera vez que Sett baja del 45% de vida máxima, se retira del combate y empieza a hacer abdominales. Con cada uno, restaura un 15% de su vida máxima y recibe un 60% de velocidad de ataque y velocidad de movimiento.");
    public static final Trait vanquisher = new Trait("Vencedor", "Las habilidades de los vencedores pueden asestar impactos críticos. También obtienen probabilidad de impacto crítico y daño de impacto crítico.");
    public static final Trait voids = new Trait("Vacio", "Obtienes mutaciones que solo pueden usar los campeones del Vacío. Los campeones del Vacío obtienen velocidad de ataque.");
    public static final Trait warden = new Trait("Protector", "La primera vez que los protectores bajan del 75% y un 25% de vida, obtienen un escudo en función de su vida máxima.");
    public static final Trait worldEnder = new Trait("Destructor de mundos","Aatrox obtiene una cantidad de daño de ataque equivalente a un % de su omnivampirismo.");
    public static final Trait yordle = new Trait("Yordle", "Obtienes más recompesas cuanto más yordles haya en tu mesa");
    public static final Trait zaun = new Trait("Zaun", "Tras 4 s, los zaunitas se imbuyen de shimmer, lo que les otorga un 15% de durabilidad y un 90% de velocidad de ataque que se reduce durante 4 s. Tras un breve enfriamiento, vuelven a imbuirse de shimmer.");
    
    public static List<Trait> getAllTraits(){
        return List.of(arcanist,ascendant,assimilator,bilgeWater,blackSmith,bruiser,caretaker,chainbreaker,chronokeeper,darkChild,darkin,defender,demacia,disruptor,dragonborn,emperor,eternal,freljord,glutton,gunslinger,harvester,heroic,hexMech,huntress,immortal,invoker,ionia,ixtal,juggernaut,longshot,noxus,piltover,quickstriker,riftcourge,runeMage,shadowIsles,shurima,slayer,soulbound,starForger,targon,theBoss,vanquisher,voids,warden,worldEnder,yordle,zaun);
    }
    
    public static int countTraits(){
        return getAllTraits().size();
    }
            
}
