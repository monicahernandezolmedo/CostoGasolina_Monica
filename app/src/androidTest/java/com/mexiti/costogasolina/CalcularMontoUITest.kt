package com.mexiti.costogasolina

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoUITest {
    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun calcularMonto_201_24_99(){
        composeTestRule.setContent {


        CostoGasolinaTheme {
            CostGasLayout( )
        }
    }
        composeTestRule.onNodeWithText("Ingresa precio por litro de Gasolina")
            .performTextInput("22.35")
        composeTestRule.onNodeWithText("Litros")
            .performTextInput("40.0")
        val montoEsperado = NumberFormat.getCurrencyInstance()
            .format(894.00)
        composeTestRule.onNodeWithText("Monto Total: $montoEsperado" )
            .assertExists("NO SE ENCONTRO NINGUN NODO CON ESTE TEST")
    }
}