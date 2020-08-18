package `fun`.craftmine.warrior

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerQuitEvent

internal class WarriorListener(private val plugin: WarriorMain): Listener {
    @EventHandler
    fun on(e: PlayerDeathEvent) {
        if (plugin.warriors.getOrDefault(e.entity.uniqueId, false)) {
            e.keepInventory = false
        }
    }

    @EventHandler
    fun on(e: PlayerQuitEvent) {
        plugin.warriors.remove(e.player.uniqueId)
    }
}