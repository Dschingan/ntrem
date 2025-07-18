
fun main() {
    // Simulated list of shared links (like SharedPreferences)
    val sharedLinks = mutableListOf<String>()

    // Function to add a link
    fun addLink(link: String) {
        sharedLinks.add(link)
        println("Link kaydedildi: $link")
    }

    // Function to simulate notification display
    fun showLinks() {
        if (sharedLinks.isEmpty()) {
            println("Hiç link yok.")
            return
        }
        println("🔔 Bildirimler:")
        sharedLinks.reversed().forEachIndexed { index, link ->
            println("${index + 1}. $link")
        }
        sharedLinks.clear()
        println("Linkler gösterildi ve temizlendi.")
    }

    // Test
    addLink("https://youtube.com/watch?v=abc")
    addLink("https://reddit.com/r/interesting")
    showLinks()
    showLinks() // İkinci kez çağırınca boş gösterir
}
