package com.example.movieapp.models

import com.example.movieapp.R

data class Movie(
    val name: String,
    val desc: String,
    val narration: String,
    val director: String,
    val releaseYear: Int,
    val movieImageResId: Int
) {


}


val myPlaylist = listOf<Movie>(
    Movie(
        name = "Avatar",
        desc = "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
        director = "James Cameron",
        releaseYear = 2009,
        movieImageResId = R.drawable.avatar,
        narration = "On the lush alien world of Pandora, Jake Sully, a Marine in a wheelchair, joins the Avatar Program and finds himself torn between loyalty to his human commanders and his newfound connection to the indigenous Na'vi people."
    ),
    Movie(
        name = "Breaking Bad",
        desc = "A high school chemistry teacher turned methamphetamine manufacturer partners with a former student to build an empire, all while battling dangerous enemies.",
        director = "Vince Gilligan",
        releaseYear = 2008,
        movieImageResId = R.drawable.breaking_bad,
        narration = "Walter White, diagnosed with terminal cancer, turns to manufacturing and selling methamphetamine in order to secure his family’s future, leading him into a dangerous world of crime and moral decay."
    ),
    Movie(
        name = "Dogs",
        desc = "The world of dog owners and lovers is explored through different stories of humans' relationships with their canine companions.",
        director = "Various",
        releaseYear = 2018,
        movieImageResId = R.drawable.dogs,
        narration = "Through the eyes of our furry friends, this documentary series takes viewers to various parts of the world to explore the bond between dogs and their owners."
    ),
    Movie(
        name = "Explained",
        desc = "A documentary series that explores a wide range of topics, from the complexities of the human mind to the mysteries of the universe.",
        director = "Various",
        releaseYear = 2018,
        movieImageResId = R.drawable.explained,
        narration = "Explained takes on complex topics and breaks them down in an accessible and engaging way, covering everything from science to culture to current events."
    ),
    Movie(
        name = "The End of the F***ing World",
        desc = "A teenage boy, who believes he's a psychopath, embarks on a journey of self-discovery with a rebellious girl, but their adventure leads to unexpected consequences.",
        director = "Jonathan Entwistle",
        releaseYear = 2017,
        movieImageResId = R.drawable.teotfw,
        narration = "James, a 17-year-old who thinks he’s a psychopath, finds himself getting caught up with Alyssa, a defiant girl, in a series of misadventures that challenge their understanding of themselves and the world around them."
    )
)

val thisWeek = listOf<Movie>(
    Movie(
        name = "Thirteen Reasons Why",
        desc = "A high school student uncovers the reasons behind his friend's tragic decision, listening to a series of tapes she left behind, which reveal secrets about their classmates and the impact of bullying.",
        director = "Brian Yorkey",
        releaseYear = 2017,
        movieImageResId = R.drawable.thirteen_reasons_why,
        narration = "After the death of Hannah Baker, her friend Clay Jensen discovers tapes that detail the thirteen reasons why she decided to end her life. The show addresses difficult topics like bullying, mental health, and the ripple effect of actions on others."
    ),

    Movie(
        name = "The Witcher",
        desc = "Based on the fantasy book series, this show follows Geralt of Rivia, a monster hunter with supernatural abilities, as he navigates a dangerous world filled with humans, elves, dwarfs, and creatures.",
        director = "Lauren Schmidt Hissrich",
        releaseYear = 2019,
        movieImageResId = R.drawable.witcher,
        narration = "Geralt of Rivia, a monster slayer known as a Witcher, journeys through the Continent, a world filled with dark magic, deadly creatures, and complex characters. The show intertwines his fate with that of a powerful sorceress and a young princess with a secret."
    ),

    Movie(
        name = "Black Mirror",
        desc = "An anthology series exploring the dark side of technology and modern society, with each episode delving into dystopian futures and the consequences of technological advancement.",
        director = "Charlie Brooker",
        releaseYear = 2011,
        movieImageResId = R.drawable.black_mirror,
        narration = "Each episode of Black Mirror is a standalone story, exploring the ways technology could potentially impact our lives, often in dark or twisted ways. From the dangers of social media to AI-run dystopias, the show imagines a future that questions the cost of progress."
    ),

    Movie(
        name = "Tiger King",
        desc = "A documentary series about the world of big cat breeding and the eccentric personalities involved, including the infamous Joe Exotic.",
        director = "Rebecca Chaiklin, Eric Goode",
        releaseYear = 2020,
        movieImageResId = R.drawable.tiger_king,
        narration = "Tiger King follows the chaotic lives of exotic animal owners, focusing on Joe Exotic, his feud with Carole Baskin, and the underground world of big cat breeding and trafficking."
    ),
)




val newlyReleased = listOf<Movie>(
    Movie(
        name = "Carole And Tuesday",
        desc = "Two girls from different backgrounds come together to create music and change the world.",
        director = "Shinichirō Watanabe",
        releaseYear = 2019,
        movieImageResId = R.drawable.carole_and_tuesday,
        narration = "Set in a futuristic Mars, Carole, an orphaned girl with dreams of becoming a musician, and Tuesday, a wealthy runaway, bond over their shared love for music. Together, they defy odds and challenge the music industry."
    ),
    Movie(
        name = "Crown",
        desc = "A historical drama chronicling the life and reign of Queen Elizabeth II.",
        director = "Peter Morgan",
        releaseYear = 2016,
        movieImageResId = R.drawable.crown,
        narration = "The Crown traces Queen Elizabeth II's life from her early reign to modern times, exploring the complexities and sacrifices of the monarchy and the personal struggles of Britain's most iconic family."
    ),
    Movie(
        name = "Stranger Things",
        desc = "A group of kids encounters strange supernatural events in their small town.",
        director = "The Duffer Brothers",
        releaseYear = 2016,
        movieImageResId = R.drawable.stranger_things,
        narration = "In the 1980s town of Hawkins, a group of young friends uncovers government secrets and supernatural threats as they search for a missing boy. Their friendship is tested as they confront otherworldly monsters and uncover dark truths."
    ),
    Movie(
        name = "Umbrella Academy",
        desc = "A dysfunctional family of adopted superhero siblings reunites to solve their father's death.",
        director = "Steve Blackman",
        releaseYear = 2019,
        movieImageResId = R.drawable.umbrella_academy,
        narration = "Seven adopted siblings, each with unique powers, are raised by a wealthy man who prepares them for a world-saving mission. Years later, they must reunite to uncover family secrets and prevent an impending apocalypse."
    ),
    Movie(
        name = "Violet Evergarden",
        desc = "A former soldier learns about emotions and humanity through her work as an Auto Memory Doll.",
        director = "Taichi Ishidate",
        releaseYear = 2018,
        movieImageResId = R.drawable.violet_evergarden,
        narration = "After the war, Violet, an emotionally detached former soldier, embarks on a journey to understand human feelings. As an 'Auto Memory Doll,' she writes letters for others, slowly discovering her own heart along the way."
    )
)