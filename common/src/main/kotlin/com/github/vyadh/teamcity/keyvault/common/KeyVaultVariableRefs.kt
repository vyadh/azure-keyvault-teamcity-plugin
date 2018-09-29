package com.github.vyadh.teamcity.keyvault.common

object KeyVaultVariableRefs {

  private val prefix = "%${KeyVaultConstants.VAR_PREFIX}"

  fun containsVars(map: Map<String, String>): Boolean {
    return map.values.any { it.contains(prefix) }
  }

}
