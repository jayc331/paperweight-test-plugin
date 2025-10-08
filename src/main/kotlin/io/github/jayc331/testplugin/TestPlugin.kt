package io.github.jayc331.testplugin

import net.minecraft.SharedConstants
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin(), Listener {
  override fun onEnable() {
    server.pluginManager.registerEvents(this, this)
    logger.info(SharedConstants.getCurrentVersion().id())
  }
}
