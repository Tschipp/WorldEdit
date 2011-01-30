// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.superpickaxe.brushes;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.blocks.BaseBlock;

public class HollowCylinderBrushShape implements BrushShape {
    private BaseBlock targetBlock;
    private int radius;
    private int height;
    
    public HollowCylinderBrushShape(BaseBlock targetBlock, int radius, int height) {
        this.targetBlock = targetBlock;
        this.radius = radius;
        this.height = height;
    }
    
    public void build(EditSession editSession, Vector pos)
            throws MaxChangedBlocksException {
        editSession.makeHollowCylinder(pos, targetBlock, radius, height);
    }
}
