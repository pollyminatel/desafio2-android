package com.example.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        supportActionBar?.title = "Digital House Foods"

        val dishes1 = mutableListOf<Dish>()
        dishes1.add(Dish("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg", "Hamburguer", "Hamburguer com cheddar"))
        dishes1.add(Dish("https://truffle-assets.imgix.net/6ba7c292-hamburguer-vegetariano_l_thumb.jpg", "Hamburguer vegetariano", "Hamburguer de soja"))
        dishes1.add(Dish("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg", "Hamburguer", "Hamburguer com cheddar"))
        dishes1.add(Dish("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg", "Hamburguer", "Hamburguer com cheddar"))
        dishes1.add(Dish("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg", "Hamburguer", "Hamburguer com cheddar"))

        val dishes2 = mutableListOf<Dish>()
        dishes2.add(Dish("https://m.bonde.com.br/img/bondenews/2018/12/img_1659.webp", "Batata frita", "Esta batata frita é feita no óleo."))
        dishes2.add(Dish("https://t1.uc.ltmcdn.com/pt/images/2/7/8/img_como_fazer_batatas_assadas_no_micro_ondas_11872_600.jpg", "Batata assada", "Esta batata assada é feita no óleo."))
        dishes2.add(Dish("https://m.bonde.com.br/img/bondenews/2018/12/img_1659.webp", "Batata frita", "Esta batata frita é feita no óleo."))
        dishes2.add(Dish("https://m.bonde.com.br/img/bondenews/2018/12/img_1659.webp", "Batata frita", "Esta batata frita é feita no óleo."))
        dishes2.add(Dish("https://m.bonde.com.br/img/bondenews/2018/12/img_1659.webp", "Batata frita", "Esta batata frita é feita no óleo."))

        val restaurants = mutableListOf<Restaurant>()
        restaurants.add(Restaurant("https://vejasp.abril.com.br/wp-content/uploads/2020/08/reabertura-noturna-de-bares-e-restaurantes-Itaim-Bibi-010.jpg.jpg", "La Cave", "R. Demétrio Ribeiro, 51", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://veja.abril.com.br/wp-content/uploads/2020/07/Bar-na-Augusta.jpg", "Pizzaria Sportello Trindade", "R. Edison Areas, 66", "Fecha às 22:00", dishes2))
        restaurants.add(Restaurant("https://etacanadavisa.com.br/main/wp-content/uploads/2018/07/image11.jpg", "Artusi", "R. Bocaiúva, 2090", "Fecha às 22:00", dishes2))
        restaurants.add(Restaurant("https://media-cdn.tripadvisor.com/media/photo-s/12/e6/c3/57/2002-bar-e-restaurante.jpg", "Seu Zé Choperia", "Av. Rio Branco, 313", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://media-cdn.tripadvisor.com/media/photo-s/1a/e4/9a/3a/porfirio-s-guadalajara.jpg", "Macarronada Italiana", "Av. Jorn. Rubéns de Arruda Ramos, 2458", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://www.viajali.com.br/wp-content/uploads/2019/01/restaurantes-itaim-bibi-20.jpg", "Sushi Miyagi", "R. Rui Barbosa, 600", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://media.gazetadopovo.com.br/2020/04/06124848/restaurante-iberico-foto-fernando-zequinao-gazeta-do-povo-960x540.jpg", "Liquorice Gastro Pub", "R. Alves de Brito, 405", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://static.portaldacidade.com/unsafe/1150x767/https://s3.amazonaws.com/louveira.portaldacidade.com/img/news/2020-06/46-vao-frequentar-menos-restaurantes-e-bares-apos-a-pandemia-diz-pesquisa-5ee537c178d73.jpg", "Delícias Portuguesas", "R. Visc. de Ouro Preto, 559", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://diaonline.ig.com.br/wp-content/uploads/2018/10/conheca-22-charmosos-restaurantes-em-goiania.jpg", "Le Rose", "R. Bocaiúva, 2224 - Loja 1", "Fecha às 22:00", dishes1))
        restaurants.add(Restaurant("https://media.gazetadopovo.com.br/bomgourmet/2019/11/restaurantes-2030-restaurante-moderno-capa-foto-bigstock-768x312-3c4880a0.jpg", "Dōkyo Japan Food", "Av. Mauro Ramos, 1512 - Loja 12", "Fecha às 22:00", dishes1))

        findViewById<RecyclerView>(R.id.rvRestaurantList).apply {
            layoutManager = LinearLayoutManager(this@RestaurantActivity)
            adapter = RestaurantAdapter(restaurants)
        }

    }
}