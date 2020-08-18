package `fun`.craftmine.warrior

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class WarriorCommand(private val plugin: WarriorMain) : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("You must be a player!")
            return false
        }
        val current = when {
            args.count() < 1 -> {
                !plugin.warriors.getOrDefault(sender.uniqueId, false)
            }
            args[0] == "on" -> {
                true
            }
            args[0] == "off" -> {
                false
            }
            else -> {
                return false
            }
        }
        plugin.warriors[sender.uniqueId] = current
        if (current) sender.sendMessage("进入勇者模式")
        else sender.sendMessage("贤者模式开启")
        return true
    }

}