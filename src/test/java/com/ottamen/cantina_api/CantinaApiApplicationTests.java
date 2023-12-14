package com.ottamen.cantina_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CantinaApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetLuoghi() throws Exception {
        mockMvc.perform(get("/luoghi"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome", is("Ripostiglio Piccolo")));
    }

    @Test
    void testGetLuogoById() throws Exception {
        mockMvc.perform(get("/luoghi/{id_luogo}", 2))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome", is("Ripostiglio Piccolo")));
    }

    @Test
    void testGetTipi() throws Exception {
        mockMvc.perform(get("/tipi"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].tipo", is("TEST-TIPO")));
    }

    @Test
    void testGetTipoById() throws Exception {
        mockMvc.perform(get("/tipi/{id_tipo}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.tipo", is("TEST-TIPO")));
    }

    @Test
    void testGetBevuti() throws Exception {
        mockMvc.perform(get("/bevuti"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome", is("Barolo")));
    }

    @Test
    void testGetBevutoById() throws Exception {
        mockMvc.perform(get("/bevuti/{id_bevuto}", 19721))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome", is("Barolo")));
    }

    @Test
    void testGetDimensioni() throws Exception {
        mockMvc.perform(get("/dimensioni"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].size", is("0.75")));
    }

    @Test
    void testGetDimensioneById() throws Exception {
        mockMvc.perform(get("/dimensioni/{id_dimensione}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size", is("0.75")));
    }


    @Test
    void testGetCategorie() throws Exception {
        mockMvc.perform(get("/categorie"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nomeCategoria", is("Red")));
    }

    @Test
    void testGetCategoriaById() throws Exception {
        mockMvc.perform(get("/categorie/{id_categoria}", 3))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nomeCategoria", is("Red")));
    }

    @Test
    void testTipiOrderedAsc() throws Exception {
        mockMvc.perform(get("/tipi/ordered/asc"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].tipo", is("Aglianico")));
    }

    @Test
    void testTipiOrderedDesc() throws Exception {
        mockMvc.perform(get("/tipi/ordered/desc"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].tipo", is("TEST-TIPO")));
    }

    @Test
    void testGetVini() throws Exception {
        mockMvc.perform(get("/vini"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome", is("Alta Mora")));
    }

    @Test
    void testGetVinoById() throws Exception {
        mockMvc.perform(get("/vini/{id}", 39593))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome", is("Alta Mora")));
    }

//    @Test
//    void testViniSum() throws Exception {
//        mockMvc.perform(get("/vini/sum"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", is(0)));
//    }
}
