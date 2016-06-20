/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [16/06/2016, 01:51:23 (GMT)]
 */
package vazkii.quark.world.sound;

import net.minecraft.client.audio.GuardianSound;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.player.EntityPlayer;

public class GuardianSound2UnderwaterBoogaloo extends GuardianSound {

	EntityGuardian visibleGuardian;
	
	public GuardianSound2UnderwaterBoogaloo(EntityGuardian guardian) {
		super(guardian);
		visibleGuardian = guardian;
	}
	
	@Override
	public void update() {
		EntityLivingBase target = visibleGuardian.getTargetedEntity();
		if(target == null || !(target instanceof EntityPlayer)) {
			donePlaying = true;
			return;
		}
		
		super.update();
	}

}