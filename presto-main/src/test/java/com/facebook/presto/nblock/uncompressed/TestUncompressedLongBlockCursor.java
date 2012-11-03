/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.presto.nblock.uncompressed;

import com.facebook.presto.nblock.AbstractTestBlockCursor;
import com.facebook.presto.nblock.Block;
import org.testng.annotations.Test;

import static com.facebook.presto.nblock.BlockAssertions.createLongsBlock;
import static io.airlift.testing.Assertions.assertInstanceOf;

public class TestUncompressedLongBlockCursor extends AbstractTestBlockCursor
{
    @Override
    protected Block createExpectedValues()
    {
        return createLongsBlock(0, 1111L, 1111L, 1111L, 2222L, 2222L, 2222L, 2222L, 2222L, 3333L, 3333L, 4444L);
    }

    @Test
    public void testCursorType()
    {
        assertInstanceOf(createExpectedValues().cursor(), UncompressedLongBlockCursor.class);
    }
}