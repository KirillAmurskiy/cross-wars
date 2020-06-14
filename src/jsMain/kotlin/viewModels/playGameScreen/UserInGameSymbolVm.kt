package viewModels.playGameScreen

import model.SideOfTheForce
import viewModels.ViewModel

class UserInGameSymbolVm(
        val userSymbol: Int,
        val sideOfTheForce: SideOfTheForce,
        val swordColor: Int,
        val glowable: Boolean = true) : ViewModel()