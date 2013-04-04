/*  Copyright (C) 2013 by Martin Kie�ling, Inc. All rights reserved.
 *  Released under the terms of the GNU General Public License version 3 or later.
 *  
 *  Contributors:
 *  Martin Kie�ling - All
 */

package de.dhbw.td.core.waves;

import java.util.List;

public class Wave {
	
	public final int enemyCount;
	public final int waveNumber;
	
	public Wave(int enemyCount, int waveNumber){
		this.enemyCount = enemyCount;
		this.waveNumber = waveNumber;
	}
}
