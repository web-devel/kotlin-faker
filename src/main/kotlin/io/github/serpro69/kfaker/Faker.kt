@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package io.github.serpro69.kfaker

import io.github.serpro69.kfaker.provider.*

/**
 * Object provides functionality to generate fake data.
 *
 * Each category from this [Faker] is represented by a property that has the same name as the `.yml` file.
 */
class Faker @JvmOverloads constructor(internal val fakerConfig: FakerConfig = FakerConfig.builder().create { }) {
    private val fakerService: FakerService = FakerService(this, fakerConfig.locale, fakerConfig.random)

    val unique = GlobalUniqueDataDataProvider()

    val randomProvider: RandomProvider = RandomProvider(fakerConfig.random)

    val separator: Separator
    val address: Address
    val ancient: Ancient
    val animal: Animal
    val app: App
    val appliance: Appliance
    val aquaTeenHungerForce: AquaTeenHungerForce
    val artist: Artist
    val backToTheFuture: BackToTheFuture
    val bank: Bank
    val basketball: Basketball
    val beer: Beer
    val bojackHoreseman: BojackHoreseman
    val book: Book
    val bossaNova: BossaNova
    val breakingBad: BreakingBad
    val buffy: Buffy
    val business: Business
    val cannabis: Cannabis
    val cat: Cat
    val chuckNorris: ChuckNorris
    val code: Code
    val coffee: Coffee
    val coin: Coin
    val color: Color
    val commerce: Commerce
    val community: Community
    val company: Company
    //    val compass: Compass
    val construction: Construction
    val cosmere: Cosmere
    val cryptoCoin: CryptoCoin
    val cultureSeries: CultureSeries
    val currency: Currency
    val dcComics: DcComics
    val demographic: Demographic
    val dessert: Dessert
    val device: Device
    val dog: Dog
    val dota: Dota
    val dragonBall: DragonBall
    val drWho: DrWho
    val dumbAndDumber: DumbAndDumber
    val dune: Dune
    val educator: Educator
    val elderScrolls: ElderScrolls
    val electricalComponents: ElectricalComponents
    val eSport: ESport
    val fallout: Fallout
    val familyGuy: FamilyGuy
    val file: File
    //    val finance: Finance
    val food: Food
    val football: Football
    val freshPriceOfBelAir: FreshPriceOfBelAir
    val friends: Friends
    val funnyName: FunnyName
    val gameOfThrones: GameOfThrones
    val gender: Gender
    val ghostBusters: GhostBusters
    val gratefulDead: GratefulDead
    val greekPhilosophers: GreekPhilosophers
    val hacker: Hacker
    val halfLife: HalfLife
    val harryPotter: HarryPotter
    val heroes: Heroes
    val heroesOfTheStorm: HeroesOfTheStorm
    val heyArnold: HeyArnold
    val hipster: Hipster
    val hitchhikersGuideToTheGalaxy: HitchhikersGuideToTheGalaxy
    val hobbit: Hobbit
    val house: House
    val howIMetYourMother: HowIMetYourMother
    val idNumber: IdNumber
    val industrySegments: IndustrySegments
    val internet: Internet
    //    val invoice: Invoice
    val job: Job
    val kPop: KPop
    val leagueOfLegends: LeagueOfLegends
    val lebowski: Lebowski
    val lordOfTheRings: LordOfTheRings
    val lorem: Lorem
    val lovecraft: Lovecraft
    val markdown: Markdown
    val marketing: Marketing
    val measurement: Measurement
    val michaelScott: MichaelScott
    val military: Military
    val movie: Movie
    val music: Music
    val myst: Myst
    val name: Name
    val nation: Nation
    val natoPhoneticAlphabet: NatoPhoneticAlphabet
    val newGirl: NewGirl
    val onePiece: OnePiece
    val overwatch: Overwatch
    val parksAndRec: ParksAndRec
    val phish: Phish
    val phoneNumber: PhoneNumber
    val pokemon: Pokemon
    val princessBride: PrincessBride
    val programmingLanguage: ProgrammingLanguage
    val quote: Quote
    val relationship: Relationship
    val restaurant: Restaurant
    val rickAndMorty: RickAndMorty
    val rockBand: RockBand
    val rupaul: Rupaul
    val science: Science
    val seinfeld: Seinfeld
    val shakespeare: Shakespeare
    val siliconValley: SiliconValley
    val simpsons: Simpsons
    val slackEmoji: SlackEmoji
    val sonicTheHedgehog: SonicTheHedgehog
    //    val source: Source
    val southPark: SouthPark
    val space: Space
    val stargate: Stargate
    val starTrek: StarTrek
    val starWars: StarWars
    val strangerThings: StrangerThings
    val stripe: Stripe
    val subscription: Subscription
    val superhero: Superhero
    val superSmashBros: SuperSmashBros
    val swordArtOnline: SwordArtOnline
    val team: Team
    val theExpanse: TheExpanse
    val theITCrowd: TheITCrowd
    val theThickOfIt: TheThickOfIt
    val twinPeaks: TwinPeaks
    val umphreysMcgee: UmphreysMcgee
    val university: University
    val vehicle: Vehicle
    val ventureBros: VentureBros
    val verbs: Verbs
    val vForVendetta: VForVendetta
    val witcher: Witcher
    val worldCup: WorldCup
    val worldOfWarcraft: WorldOfWarcraft
    val yoda: Yoda
    val zelda: Zelda

    init {
        separator = Separator(fakerService)
        address = Address(fakerService)
        ancient = Ancient(fakerService)
        animal = Animal(fakerService)
        app = App(fakerService)
        appliance = Appliance(fakerService)
        aquaTeenHungerForce = AquaTeenHungerForce(fakerService)
        artist = Artist(fakerService)
        backToTheFuture = BackToTheFuture(fakerService)
        bank = Bank(fakerService)
        basketball = Basketball(fakerService)
        beer = Beer(fakerService)
        bojackHoreseman = BojackHoreseman(fakerService)
        book = Book(fakerService)
        bossaNova = BossaNova(fakerService)
        breakingBad = BreakingBad(fakerService)
        buffy = Buffy(fakerService)
        business = Business(fakerService)
        cannabis = Cannabis(fakerService)
        cat = Cat(fakerService)
        chuckNorris = ChuckNorris(fakerService)
        code = Code(fakerService)
        coffee = Coffee(fakerService)
        coin = Coin(fakerService)
        color = Color(fakerService)
        commerce = Commerce(fakerService)
        community = Community(fakerService)
        company = Company(fakerService)
//        compass = Compass(fakerService)
        construction = Construction(fakerService)
        cosmere = Cosmere(fakerService)
        cryptoCoin = CryptoCoin(fakerService)
        cultureSeries = CultureSeries(fakerService)
        currency = Currency(fakerService)
        dcComics = DcComics(fakerService)
        demographic = Demographic(fakerService)
        dessert = Dessert(fakerService)
        device = Device(fakerService)
        dog = Dog(fakerService)
        dota = Dota(fakerService)
        dragonBall = DragonBall(fakerService)
        drWho = DrWho(fakerService)
        dumbAndDumber = DumbAndDumber(fakerService)
        dune = Dune(fakerService)
        educator = Educator(fakerService)
        elderScrolls = ElderScrolls(fakerService)
        electricalComponents = ElectricalComponents(fakerService)
        eSport = ESport(fakerService)
//        fakeDataProvider = FakeDataProvider(fakerService)
        fallout = Fallout(fakerService)
        familyGuy = FamilyGuy(fakerService)
        file = File(fakerService)
//        finance = Finance(fakerService)
        food = Food(fakerService)
        football = Football(fakerService)
        freshPriceOfBelAir = FreshPriceOfBelAir(fakerService)
        friends = Friends(fakerService)
        funnyName = FunnyName(fakerService)
        gameOfThrones = GameOfThrones(fakerService)
        gender = Gender(fakerService)
        ghostBusters = GhostBusters(fakerService)
        gratefulDead = GratefulDead(fakerService)
        greekPhilosophers = GreekPhilosophers(fakerService)
        hacker = Hacker(fakerService)
        halfLife = HalfLife(fakerService)
        harryPotter = HarryPotter(fakerService)
        heroes = Heroes(fakerService)
        heroesOfTheStorm = HeroesOfTheStorm(fakerService)
        heyArnold = HeyArnold(fakerService)
        hipster = Hipster(fakerService)
        hitchhikersGuideToTheGalaxy = HitchhikersGuideToTheGalaxy(fakerService)
        hobbit = Hobbit(fakerService)
        house = House(fakerService)
        howIMetYourMother = HowIMetYourMother(fakerService)
        idNumber = IdNumber(fakerService)
        industrySegments = IndustrySegments(fakerService)
        internet = Internet(fakerService)
//        invoice = Invoice(fakerService)
        job = Job(fakerService)
        kPop = KPop(fakerService)
        leagueOfLegends = LeagueOfLegends(fakerService)
        lebowski = Lebowski(fakerService)
        lordOfTheRings = LordOfTheRings(fakerService)
        lorem = Lorem(fakerService)
        lovecraft = Lovecraft(fakerService)
        markdown = Markdown(fakerService)
        marketing = Marketing(fakerService)
        measurement = Measurement(fakerService)
        michaelScott = MichaelScott(fakerService)
        military = Military(fakerService)
        movie = Movie(fakerService)
        music = Music(fakerService)
        myst = Myst(fakerService)
        name = Name(fakerService)
        nation = Nation(fakerService)
        natoPhoneticAlphabet = NatoPhoneticAlphabet(fakerService)
        newGirl = NewGirl(fakerService)
        onePiece = OnePiece(fakerService)
        overwatch = Overwatch(fakerService)
        parksAndRec = ParksAndRec(fakerService)
        phish = Phish(fakerService)
        phoneNumber = PhoneNumber(fakerService)
        pokemon = Pokemon(fakerService)
        princessBride = PrincessBride(fakerService)
        programmingLanguage = ProgrammingLanguage(fakerService)
        quote = Quote(fakerService)
        relationship = Relationship(fakerService)
        restaurant = Restaurant(fakerService)
        rickAndMorty = RickAndMorty(fakerService)
        rockBand = RockBand(fakerService)
        rupaul = Rupaul(fakerService)
        science = Science(fakerService)
        seinfeld = Seinfeld(fakerService)
        shakespeare = Shakespeare(fakerService)
        siliconValley = SiliconValley(fakerService)
        simpsons = Simpsons(fakerService)
        slackEmoji = SlackEmoji(fakerService)
        sonicTheHedgehog = SonicTheHedgehog(fakerService)
//        source = Source(fakerService)
        southPark = SouthPark(fakerService)
        space = Space(fakerService)
        stargate = Stargate(fakerService)
        starTrek = StarTrek(fakerService)
        starWars = StarWars(fakerService)
        strangerThings = StrangerThings(fakerService)
        stripe = Stripe(fakerService)
        subscription = Subscription(fakerService)
        superhero = Superhero(fakerService)
        superSmashBros = SuperSmashBros(fakerService)
        swordArtOnline = SwordArtOnline(fakerService)
        team = Team(fakerService)
        theExpanse = TheExpanse(fakerService)
        theITCrowd = TheITCrowd(fakerService)
        theThickOfIt = TheThickOfIt(fakerService)
        twinPeaks = TwinPeaks(fakerService)
        umphreysMcgee = UmphreysMcgee(fakerService)
        university = University(fakerService)
        vehicle = Vehicle(fakerService)
        ventureBros = VentureBros(fakerService)
        verbs = Verbs(fakerService)
        vForVendetta = VForVendetta(fakerService)
        witcher = Witcher(fakerService)
        worldCup = WorldCup(fakerService)
        worldOfWarcraft = WorldOfWarcraft(fakerService)
        yoda = Yoda(fakerService)
        zelda = Zelda(fakerService)
    }
}
