/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.collections

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.js.*
import kotlin.ranges.contains
import kotlin.ranges.reversed

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UIntArray.elementAt(index: Int): UInt {
    return elementAtOrElse(index) { throw IndexOutOfBoundsException("index: $index, size: $size}") }
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun ULongArray.elementAt(index: Int): ULong {
    return elementAtOrElse(index) { throw IndexOutOfBoundsException("index: $index, size: $size}") }
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UByteArray.elementAt(index: Int): UByte {
    return elementAtOrElse(index) { throw IndexOutOfBoundsException("index: $index, size: $size}") }
}

/**
 * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this array.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UShortArray.elementAt(index: Int): UShort {
    return elementAtOrElse(index) { throw IndexOutOfBoundsException("index: $index, size: $size}") }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UIntArray.asList(): List<UInt> {
    return object : AbstractList<UInt>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UInt): Boolean = this@asList.contains(element)
        override fun get(index: Int): UInt {
            AbstractList.checkElementIndex(index, size)
            return this@asList[index]
        }
        override fun indexOf(element: UInt): Int {
            if ((element as Any?) !is UInt) return -1
            return this@asList.indexOf(element)
        }
        override fun lastIndexOf(element: UInt): Int {
            if ((element as Any?) !is UInt) return -1
            return this@asList.lastIndexOf(element)
        }
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun ULongArray.asList(): List<ULong> {
    return object : AbstractList<ULong>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: ULong): Boolean = this@asList.contains(element)
        override fun get(index: Int): ULong {
            AbstractList.checkElementIndex(index, size)
            return this@asList[index]
        }
        override fun indexOf(element: ULong): Int {
            if ((element as Any?) !is ULong) return -1
            return this@asList.indexOf(element)
        }
        override fun lastIndexOf(element: ULong): Int {
            if ((element as Any?) !is ULong) return -1
            return this@asList.lastIndexOf(element)
        }
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UByteArray.asList(): List<UByte> {
    return object : AbstractList<UByte>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UByte): Boolean = this@asList.contains(element)
        override fun get(index: Int): UByte {
            AbstractList.checkElementIndex(index, size)
            return this@asList[index]
        }
        override fun indexOf(element: UByte): Int {
            if ((element as Any?) !is UByte) return -1
            return this@asList.indexOf(element)
        }
        override fun lastIndexOf(element: UByte): Int {
            if ((element as Any?) !is UByte) return -1
            return this@asList.lastIndexOf(element)
        }
    }
}

/**
 * Returns a [List] that wraps the original array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public actual fun UShortArray.asList(): List<UShort> {
    return object : AbstractList<UShort>(), RandomAccess {
        override val size: Int get() = this@asList.size
        override fun isEmpty(): Boolean = this@asList.isEmpty()
        override fun contains(element: UShort): Boolean = this@asList.contains(element)
        override fun get(index: Int): UShort {
            AbstractList.checkElementIndex(index, size)
            return this@asList[index]
        }
        override fun indexOf(element: UShort): Int {
            if ((element as Any?) !is UShort) return -1
            return this@asList.indexOf(element)
        }
        override fun lastIndexOf(element: UShort): Int {
            if ((element as Any?) !is UShort) return -1
            return this@asList.lastIndexOf(element)
        }
    }
}

/**
 * Fills original array with the provided value.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@Suppress("ACTUAL_FUNCTION_WITH_DEFAULT_ARGUMENTS")
public actual fun UIntArray.fill(element: UInt, fromIndex: Int = 0, toIndex: Int = size): Unit {
    storage.fill(element.toInt(), fromIndex, toIndex)
}

/**
 * Fills original array with the provided value.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@Suppress("ACTUAL_FUNCTION_WITH_DEFAULT_ARGUMENTS")
public actual fun ULongArray.fill(element: ULong, fromIndex: Int = 0, toIndex: Int = size): Unit {
    storage.fill(element.toLong(), fromIndex, toIndex)
}

/**
 * Fills original array with the provided value.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@Suppress("ACTUAL_FUNCTION_WITH_DEFAULT_ARGUMENTS")
public actual fun UByteArray.fill(element: UByte, fromIndex: Int = 0, toIndex: Int = size): Unit {
    storage.fill(element.toByte(), fromIndex, toIndex)
}

/**
 * Fills original array with the provided value.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@Suppress("ACTUAL_FUNCTION_WITH_DEFAULT_ARGUMENTS")
public actual fun UShortArray.fill(element: UShort, fromIndex: Int = 0, toIndex: Int = size): Unit {
    storage.fill(element.toShort(), fromIndex, toIndex)
}

