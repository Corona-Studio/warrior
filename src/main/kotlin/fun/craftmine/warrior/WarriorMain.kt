package `fun`.craftmine.warrior

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.*
import kotlin.collections.HashMap

class WarriorMain: JavaPlugin() {
    lateinit var warriors: HashMap<UUID, Boolean>

    override fun onEnable() {
        saveDefaultConfig()
        warriors = hashMapOf()
        Bukkit.getPluginManager().registerEvents(WarriorListener(this), this)
        Bukkit.getPluginCommand("warrior")!!.setExecutor(WarriorCommand(this))
    }

    override fun onDisable() {
        saveConfig()
    }
}