package br.com.alex.whatsappstudy.data.repository

import br.com.alex.whatsappstudy.data.api.AppResult
import br.com.alex.whatsappstudy.data.api.NewsApi
import br.com.alex.whatsappstudy.data.model.NewsResponse
import com.google.gson.Gson

class ChatsRepositoryImpl(private val api: NewsApi) : ChatsRepository {

    override suspend fun getNews(): AppResult<NewsResponse?> {
//        return try {
//            val response = api.getNews("us", "126c1e71e05c42f9861a3da85a29c75b")
//            if (response.isSuccessful) {
//                AppResult.Success(response.body())
//            } else {
//                AppResult.Error(Exception(response.message()))
//            }
//        } catch (e: Exception) {
//            AppResult.Error(e)
//        }
        return AppResult.Success(getNewsMock())
    }

    private fun getNewsMock(): NewsResponse {
        val jsonString = """{
   "status":"ok",
   "totalResults":38,
   "articles":[
      {
         "source":{
            "id":"cnn",
            "name":"CNN"
         },
         "author":"By <a href=\"/profiles/tara-subramaniam\">Tara Subramaniam</a>, <a href=\"/profiles/jessie-yeung\">Jessie Yeung</a>, Christian Edwards, <a href=\"/profiles/adrienne-vogt\">Adrienne Vogt</a>, <a href=\"/profiles/aditi-sandal\">Aditi Sangal</a>, <a href=\"/profiles/maureen-chowdhury\">Maureen Chowdhury</a> and <a href=\"/profiles/tori-powell\">Tori B. Powell</a>, CNN",
         "title":"Live updates: Israel-Hamas war, hostage release deal approved, 4-day Gaza truce - CNN",
         "description":"Israel's cabinet has approved a deal for the release of hostages seized by Hamas in exchange for a pause in fighting in Gaza. Follow for live updates.",
         "url":"https://www.cnn.com/middleeast/live-news/israel-hamas-war-gaza-news-11-22-23/index.html",
         "urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/231117195046-07-palestine-protest-11172023-ny-super-tease.jpg",
         "publishedAt":"2023-11-23T00:33:00Z",
         "content":"The hostage deal does not include the \"release of murderers,\" Israeli Prime Minister Benjamin Netanyahu said Wednesday while disclosing more details from the agreement. \r\nMost Israelis have welcomed … [+1592 chars]"
      },
      {
         "source":{
            "id":"abc-news",
            "name":"ABC News"
         },
         "author":"MIKE CORDER Associated Press, RAF CASERT Associated Press",
         "title":"Anti-Islam populist Wilders heading for a massive win in Netherlands in a shock for Europe - ABC News",
         "description":"An exit poll says the far-right and anti-Islam populist Geert Wilders is heading for a massive parliamentary election victory",
         "url":"https://abcnews.go.com/International/wireStory/election-replace-longest-serving-leader-netherlands-voters-clean-105087882",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "publishedAt":"2023-11-22T23:42:47Z",
         "content":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the biggest political upsets in Dutch politics s… [+4623 chars]"
      },
      {
         "source":{
            "id":"abc-news",
            "name":"ABC News"
         },
         "author":"RIO YAMAT Associated Press",
         "title":"A Las Vegas high school grapples with how a feud over stolen items escalated into a fatal beating - ABC News",
         "description":"\"There’s no magic wand to solve this.\"",
         "url":"https://abcnews.go.com/US/wireStory/las-vegas-high-school-grapples-feud-stolen-items-105087880",
         "urlToImage":"https://i.abcnewsfe.com/a/eb3383b5-f846-4fc3-a228-efbb400ddef7/wirestory_3373508c4772c0f5c0e222449bee64ec_16x9.jpg?w=992",
         "publishedAt":"2023-11-22T23:34:33Z",
         "content":"LAS VEGAS -- Students at a Las Vegas high school had gone home for the day when an urgent message was broadcast from the intercom: A defibrillator was needed near one of the classrooms.\r\nA nurse ran … [+4742 chars]"
      },
      {
         "source":{
            "id":"the-wall-street-journal",
            "name":"The Wall Street Journal"
         },
         "author":"Dov Lieber, Omar Abdel-Baqui",
         "title":"Inside Israel's Campaign to Prove a Gaza Hospital Was a Hamas Command Center - The Wall Street Journal",
         "description":"The humanitarian fallout from the war has heaped pressure on Israel to justify its seizure of Al-Shifa Hospital",
         "url":"https://www.wsj.com/world/middle-east/inside-israels-campaign-to-prove-a-gaza-hospital-was-a-hamas-command-center-65e655ee",
         "urlToImage":"https://images.wsj.net/im-890483/social",
         "publishedAt":"2023-11-22T22:56:00Z",
         "content":"The Israeli military has stepped up its efforts to produce evidence that Gazas largest hospital was a Hamas command center, as the humanitarian fallout from war and \r\nseizure of Al-Shifa Hospital has… [+484 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"NBCSports.com"
         },
         "author":"Mike Florio",
         "title":"Jim Irsay threatens to sue ESPN's First Take - NBC Sports",
         "description":"Colts owner Jim Irsay made a stir by saying — and then insisting — on HBO's Real Sports with Bryant Gumbel that his 2014 arrest came from prejudice against white billionaires.",
         "url":"https://www.nbcsports.com/nfl/profootballtalk/rumor-mill/news/jim-irsay-threatens-to-sue-espns-first-take",
         "urlToImage":"https://nbcsports.brightspotcdn.com/dims4/default/c266630/2147483647/strip/true/crop/2200x1238+0+241/resize/1440x810!/quality/90/?url=https%3A%2F%2Fnbc-sports-production-nbc-sports.s3.us-east-1.amazonaws.com%2Fbrightspot%2Fb6%2F69%2F03c96d354a4b8de162df9e120a06%2Fhttps-api-imagn.com%2Frest%2Fdownload%2FimageID%3D21738671",
         "publishedAt":"2023-11-22T21:47:36Z",
         "content":"Colts owner Jim Irsay made a stir by saying and then insisting on HBOs Real Sports with Bryant Gumbel that his 2014 arrest came from prejudice against white billionaires. It prompted a reaction from … [+2500 chars]"
      },
      {
         "source":{
            "id":"wired",
            "name":"Wired"
         },
         "author":"Peter Guest, Morgan Meaker",
         "title":"Sam Altman's Second Coming Sparks New Fears of the AI Apocalypse - WIRED",
         "description":"Five days of chaos at OpenAI revealed weaknesses in the company’s self-governance. That worries people who believe AI poses an existential risk and proponents of AI regulation.",
         "url":"https://www.wired.com/story/sam-altman-second-coming-sparks-new-fears-ai-apocalypse/",
         "urlToImage":"https://media.wired.com/photos/655e01daf1c66c0a818775fe/191:100/w_1280,c_limit/samaltman-biz-GettyImages-1769720820.jpg",
         "publishedAt":"2023-11-22T21:11:09Z",
         "content":"Open AIs new boss is the same as the old boss. But the companyand the artificial intelligence industrymay have been profoundly changed by the past five days of high-stakes soap opera. Sam Altman, Ope… [+3761 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"CBS Sports"
         },
         "author":"",
         "title":"Fantasy Football Week 12 Start 'Em & Sit 'Em Running Backs: Kyren Williams Returns and more - CBS Sports",
         "description":"Kyren Williams is set up for a big day in his first action since Week 6",
         "url":"https://www.cbssports.com/fantasy/football/news/fantasy-football-week-12-start-em-sit-em-running-backs-kyren-williams-returns-and-more/",
         "urlToImage":"https://sportshub.cbsistatic.com/i/r/2023/09/20/8dcbcb86-c366-49f8-94bc-49246e10e17d/thumbnail/1200x675/c1143d309598fb5d0f3c26b4d6c8963e/kyren-williams-1400-us.jpg",
         "publishedAt":"2023-11-22T20:40:16Z",
         "content":"There are no byes this week but there are a bevy of injuries you'll need to keep track of in order to light up Fantasy scoreboards this week. Significant injuries to true RB1s have shaken the foundat… [+471 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"YouTube"
         },
         "author":null,
         "title":"What’s next for Binance after its CEO stepped down and pleaded guilty: CNBC Crypto World - CNBC Television",
         "description":"CNBC Crypto World features the latest news and daily trading updates from the digital currency markets and provides viewers with a look at what’s ahead with ...",
         "url":"https://www.youtube.com/watch?v=2G8JOTmdC6I",
         "urlToImage":"https://i.ytimg.com/vi/2G8JOTmdC6I/maxresdefault.jpg",
         "publishedAt":"2023-11-22T20:22:09Z",
         "content":null
      },
      {
         "source":{
            "id":null,
            "name":"Yahoo Entertainment"
         },
         "author":"Frank Schwab",
         "title":"Former Lions QB Scott Mitchell goes off after Barry Sanders doc, rips Eminem and Jeff Daniels - Yahoo Sports",
         "description":"Scott Mitchell doesn't seem to have great feelings about his Lions legacy.",
         "url":"https://sports.yahoo.com/former-lions-qb-scott-mitchell-goes-off-after-barry-sanders-doc-rips-eminem-and-jeff-daniels-201227636.html",
         "urlToImage":"https://s.yimg.com/ny/api/res/1.2/Go2xuR00Yr_KjvUN1KD4lA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MTA-/https://s.yimg.com/os/creatr-uploaded-images/2023-11/d256dd20-896e-11ee-8b7b-3540d044450d",
         "publishedAt":"2023-11-22T20:15:22Z",
         "content":"You didn't expect a Scott Mitchell vs. Eminem feud this week, but it happened.\r\nA new Barry Sanders documentary \"Bye Bye Barry\" was released on Amazon Prime Video this week. It features Emimen, the m… [+3311 chars]"
      },
      {
         "source":{
            "id":"the-washington-post",
            "name":"The Washington Post"
         },
         "author":"Timothy Bella",
         "title":"Iowa Republican’s wife convicted of voter fraud to help him in 2020 elections - The Washington Post",
         "description":"Kim Phuong Taylor wanted her husband, Iowa county supervisor Jeremy Taylor, to win “by any means necessary” in the 2020 elections, prosecutors say.",
         "url":"https://www.washingtonpost.com/politics/2023/11/22/iowa-voter-fraud-wife-husband-republican/",
         "urlToImage":"https://www.washingtonpost.com/resizer/2CjPNwqvXHPS_2RpuRTKY-p3eVo=/1484x0/www.washingtonpost.com/pb/resources/img/twp-social-share.png",
         "publishedAt":"2023-11-22T20:13:00Z",
         "content":"Comment on this story\r\nComment\r\nAdd to your saved stories\r\nSave\r\nA previous version of this article incorrectly said that Woodbury County Supervisor Jeremy Taylor had been charged in the voter-fraud … [+7092 chars]"
      },
      {
         "source":{
            "id":"buzzfeed",
            "name":"Buzzfeed"
         },
         "author":"Joseph Longo",
         "title":"Macy's Thanksgiving Day Parade Balloon Facts - BuzzFeed",
         "description":"Read up on the legendary balloons before this year's Macy's Thanksgiving Day Parade.",
         "url":"https://www.buzzfeed.com/josephlongo/macys-thanksgiving-day-parade-balloons-facts",
         "urlToImage":"https://img.buzzfeed.com/buzzfeed-static/static/2023-11/22/19/enhanced/852b96d5dc1e/original-3660-1700681080-2.jpg?crop=1581:830;0,0%26downsize=1250:*",
         "publishedAt":"2023-11-22T20:01:20Z",
         "content":null
      },
      {
         "source":{
            "id":"cbs-news",
            "name":"CBS News"
         },
         "author":"Caitlin O'Kane",
         "title":"Archaeologists discover mummies of children that may be at least 1,000 years old – and their skulls still had hair on them - CBS News",
         "description":"The mummies were found in what is now one of the oldest neighborhoods in Lima, in what was used as a sacred ceremonial space.",
         "url":"https://www.cbsnews.com/news/peru-mummy-children-archaeologists-hair-skulls/",
         "urlToImage":"https://assets2.cbsnewsstatic.com/hub/i/r/2023/11/22/18b952fe-e4a7-4350-9052-525ac10c23fd/thumbnail/1200x630/e2e76b333fbcda1ec6c375a57ef3ead1/2023-11-21t225337z-1624769053-rc2kh4ahgq6n-rtrmadp-3-peru-archaeology.jpg?v=5659e73acd91751548aa89950cf015b0",
         "publishedAt":"2023-11-22T19:55:20Z",
         "content":"Four mummified children have been discovered in Peru — and they are believed to be at least 1,000 years old. The mummies were found in what is now one of the oldest neighborhoods in Lima, in what was… [+3336 chars]"
      },
      {
         "source":{
            "id":"techcrunch",
            "name":"TechCrunch"
         },
         "author":"Aisha Malik",
         "title":"Google’s Bard AI chatbot can now answer questions about YouTube videos - TechCrunch",
         "description":"Google has announced that its Bard AI chatbot can now answer questions about YouTube videos.",
         "url":"https://techcrunch.com/2023/11/22/googles-bard-ai-chatbot-can-now-answer-questions-about-youtube-videos/",
         "urlToImage":"https://techcrunch.com/wp-content/uploads/2023/05/GettyImages-1246897887.jpg?resize=1200,800",
         "publishedAt":"2023-11-22T19:23:53Z",
         "content":"Google has announced that its Bard AI chatbot can now answer questions about YouTube videos. Although Bard already had the ability to analyze YouTube videos with the launch of the YouTube Extension b… [+1992 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"Hollywood Reporter"
         },
         "author":"Aaron Couch",
         "title":"Jenna Ortega Drops Out of Scream VII – The Hollywood Reporter - Hollywood Reporter",
         "description":"The news comes one day after Spyglass fired Melissa Barrera from the project.",
         "url":"https://www.hollywoodreporter.com/movies/movie-news/jenna-ortega-quits-scream-vii-1235675434/",
         "urlToImage":"https://www.hollywoodreporter.com/wp-content/uploads/2023/11/GettyImages-1702435228-copy.jpg?w=1024",
         "publishedAt":"2023-11-22T18:56:15Z",
         "content":"The Scream franchise is getting murdered.\r\nOne day after Spyglass fired star Melissa Barrera from Scream VII, the latest installment of the horror movie series, it has been revealed that Jenna Ortega… [+1500 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"NASA"
         },
         "author":"Jet Propulsion Laboratory",
         "title":"NASA Uses Two Worlds to Test Future Mars Helicopter Designs - NASA",
         "description":"Engineers will go beyond the ends of the Earth to find more performance for future Mars helicopters.",
         "url":"https://www.nasa.gov/missions/mars-2020-perseverance/ingenuity-helicopter/nasa-uses-two-worlds-to-test-future-mars-helicopter-designs/",
         "urlToImage":"https://www.nasa.gov/wp-content/uploads/2023/11/2worldscrop.jpg",
         "publishedAt":"2023-11-22T18:49:48Z",
         "content":"This video combines two perspectives of the 59th flight of NASAs Ingenuity Mars Helicopter. Video on the left was captured by the Mastcam-Z on NASAs Perseverance Mars rover; the black-and-white video… [+7006 chars]"
      },
      {
         "source":{
            "id":"espn",
            "name":"ESPN"
         },
         "author":"Alexa Philippou",
         "title":"UConn's Azzi Fudd out for season with torn ACL, meniscus - ESPN - ESPN",
         "description":"UConn star Azzi Fudd suffered a torn ACL and meniscus during practice last week and will miss the rest of the 2023-24 season.",
         "url":"https://www.espn.com/womens-college-basketball/story/_/id/38959357/uconn-azzi-fudd-season-torn-acl-meniscus",
         "urlToImage":"https://a3.espncdn.com/combiner/i?img=%2Fphoto%2F2023%2F0112%2Fr1116611_1296x729_16%2D9.jpg",
         "publishedAt":"2023-11-22T18:45:00Z",
         "content":"UConn guard Azzi Fudd will miss the remainder of the 2023-24 season after suffering ACL and medial meniscal tears in her right knee, the team announced Wednesday.\r\nFudd suffered the noncontact injury… [+2956 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"YouTube"
         },
         "author":null,
         "title":"JFK Assassination: Hundreds gather at Dealey Plaza to commemorate 60 years since president's death - FOX 4 Dallas-Fort Worth",
         "description":"Wednesday marks 60 years since President John F. Kennedy was assassinated in Dallas. Hundreds gathered at Dealey Plaza to remember the president and the fate...",
         "url":"https://www.youtube.com/watch?v=WO-cFBJzsRQ",
         "urlToImage":"https://i.ytimg.com/vi/WO-cFBJzsRQ/hqdefault.jpg",
         "publishedAt":"2023-11-22T18:32:19Z",
         "content":null
      },
      {
         "source":{
            "id":"ars-technica",
            "name":"Ars Technica"
         },
         "author":"Samuel Axon",
         "title":"Report: Sonos will launch its fancy headphones next spring - Ars Technica",
         "description":"Report claims Sonos is expanding into new products to make up for slowing sales.",
         "url":"https://arstechnica.com/gadgets/2023/11/sonos-plans-roku-like-tv-streaming-box-and-airpods-max-like-headphones/",
         "urlToImage":"https://cdn.arstechnica.net/wp-content/uploads/2021/11/airpods-max-760x380.jpg",
         "publishedAt":"2023-11-22T18:25:30Z",
         "content":"Enlarge/ Apple's AirPods Max, a close analog to what Sonos plans to launch in April.\r\n22 with \r\nBloomberg reporter Mark Gurman isn't just reporting about the inner workings of Apple; he's breaking ne… [+2883 chars]"
      },
      {
         "source":{
            "id":null,
            "name":"Space.com"
         },
         "author":"Brett Tingley",
         "title":"Watch SpaceX's Starship explode in astronomer's stunning telescope footage (video) - Space.com",
         "description":"'There it was, spinning out of control, spewing clouds of gas in multiple directions.'",
         "url":"https://www.space.com/spacex-starship-telescope-astronomer-video",
         "urlToImage":"https://cdn.mos.cms.futurecdn.net/23mrcKyxpuUYMCnYQfDjyi-1200-80.jpg",
         "publishedAt":"2023-11-22T18:25:28Z",
         "content":"Space is part of Future US Inc, an international media group and leading digital publisher. Visit our corporate site.\r\n©\r\nFuture US, Inc. Full 7th Floor, 130 West 42nd Street,\r\nNew York,\r\nNY 10036."
      },
      {
         "source":{
            "id":null,
            "name":"Umn.edu"
         },
         "author":null,
         "title":"MRI study spotlights impact of long COVID on the brain - University of Minnesota Twin Cities",
         "description":null,
         "url":"https://www.cidrap.umn.edu/covid-19/mri-study-spotlights-impact-long-covid-brain",
         "urlToImage":"https://www.cidrap.umn.edu/sites/default/files/styles/layout_large/public/article/iStock-1292254104.jpg?itok=PM9MuBgx",
         "publishedAt":"2023-11-22T18:04:44Z",
         "content":null
      }
   ]
}"""
        return Gson().fromJson(jsonString, NewsResponse::class.java)
    }
}