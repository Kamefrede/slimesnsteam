package xyz.kamefrede.slimesnsteam.common

import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(SlimesNSteam.ID)
object SlimesNSteam {
    const val ID: String = "slimesnsteam"

    val LOGGER: Logger = LogManager.getLogger()

    init {
        LOGGER.debug("Slimes 'n' Steam Initializing")
    }

}