---
title: PixelFormat
second_title: Aspose.3D für Java API-Referenz
description: Das Pixel-Format, das in der Textureinheit verwendet wird.
type: docs
weight: 290
url: /de/java/com.aspose.threed/pixelformat/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PixelFormat extends Enum<PixelFormat>
```

Das Pixel‑Format, das in der Textureinheit verwendet wird.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [A1R5G5B5](#A1R5G5B5) | 16‑Bit‑Pixelformat, 5 Bits für Blau, Grün, Rot und 1 Bit für Alpha. |
| [A2B10G10R10](#A2B10G10R10) | 32‑Bit‑Pixelformat, 10 Bits für Blau, Grün und Rot, 2 Bits für Alpha. |
| [A2R10G10B10](#A2R10G10B10) | 32‑Bit‑Pixelformat, 2 Bits für Alpha, 10 Bits für Rot, Grün und Blau. |
| [A4L4](#A4L4) | 8‑Bit‑Pixelformat, 4 Bits Alpha, 4 Bits Luminanz. |
| [A4R4G4B4](#A4R4G4B4) | 16‑Bit‑Pixelformat, 4 Bits für Alpha, Rot, Grün und Blau. |
| [A8](#A8) | 8‑Bit‑Pixelformat, alle Bits Alpha. |
| [A8B8G8R8](#A8B8G8R8) | 32‑Bit‑Pixelformat, 8 Bits für Blau, Grün, Rot und Alpha. |
| [A8R8G8B8](#A8R8G8B8) | 32‑Bit‑Pixelformat, 8 Bits für Alpha, Rot, Grün und Blau. |
| [B5G6R5](#B5G6R5) | 16‑Bit‑Pixelformat, 5 Bits Rot, 6 Bits Grün, 5 Bits Blau. |
| [B8](#B8) | 8‑Bit‑Pixelformat, alle Bits Blau. |
| [B8G8R8](#B8G8R8) | 24‑Bit‑Pixelformat, 8 Bits für Blau, Grün und Rot. |
| [B8G8R8A8](#B8G8R8A8) | 32‑Bit‑Pixelformat, 8 Bits für Blau, Grün, Rot und Alpha. |
| [BYTE_LA](#BYTE-LA) | 2‑Byte‑Pixelformat, 1 Byte Luminanz, 1 Byte Alpha. |
| [DEPTH](#DEPTH) | Depth-Texturformat. |
| [DXT1](#DXT1) | DDS (DirectDraw Surface) DXT1-Format. |
| [DXT2](#DXT2) | DDS (DirectDraw Surface) DXT2-Format. |
| [DXT3](#DXT3) | DDS (DirectDraw Surface) DXT3-Format. |
| [DXT4](#DXT4) | DDS (DirectDraw Surface) DXT4-Format. |
| [DXT5](#DXT5) | DDS (DirectDraw Surface) DXT5-Format. |
| [FLOAT16_GR](#FLOAT16-GR) | 32-bit, 2-Kanal s10e5 Gleitkomma-Pixelformat, 16-bit Grün, 16-bit Rot |
| [FLOAT16_R](#FLOAT16-R) | 16-bit-Pixelformat, 16 Bits (float) für Rot |
| [FLOAT16_RGB](#FLOAT16-RGB) | 48-bit-Pixelformat, 16 Bits (float) für Rot, 16 Bits (float) für Grün, 16 Bits (float) für Blau |
| [FLOAT16_RGBA](#FLOAT16-RGBA) | 64-bit-Pixelformat, 16 Bits (float) für Rot, 16 Bits (float) für Grün, 16 Bits (float) für Blau, 16 Bits (float) für Alpha |
| [FLOAT32_GR](#FLOAT32-GR) | 64-bit, 2-Kanal Gleitkomma-Pixelformat, 32-bit Grün, 32-bit Rot |
| [FLOAT32_R](#FLOAT32-R) | 32-bit-Pixelformat, 32 Bits (float) für Rot |
| [FLOAT32_RGB](#FLOAT32-RGB) | 96-bit-Pixelformat, 32 Bits (float) für Rot, 32 Bits (float) für Grün, 32 Bits (float) für Blau |
| [FLOAT32_RGBA](#FLOAT32-RGBA) | 128-bit-Pixelformat, 32 Bits (float) für Rot, 32 Bits (float) für Grün, 32 Bits (float) für Blau, 32 Bits (float) für Alpha |
| [G8](#G8) | 8-bit-Pixelformat, alle Bits Grün. |
| [L16](#L16) | 16-bit-Pixelformat, alle Bits Luminanz. |
| [L8](#L8) | 8-bit-Pixelformat, alle Bits Luminanz. |
| [R32G32B32A32_UINT](#R32G32B32A32-UINT) | 128-bit-Pixelformat, 32 Bits Rot (unsigned int), 32 Bits Blau (unsigned int), 32 Bits Grün (unsigned int), 32 Bits Alpha (unsigned int). |
| [R32G32_UINT](#R32G32-UINT) | 64-bit-Pixelformat, 32 Bits Rot (unsigned int), 32 Bits Blau (unsigned int). |
| [R32_UINT](#R32-UINT) | 32-bit-Pixelformat, 32 Bits Rot (unsigned int). |
| [R3G3B2](#R3G3B2) | 8-bit-Pixelformat, 2 Bits Blau, 3 Bits Grün, 3 Bits Rot. |
| [R5G6B5](#R5G6B5) | 16‑Bit‑Pixelformat, 5 Bits Rot, 6 Bits Grün, 5 Bits Blau. |
| [R8](#R8) | 8-bit-Pixelformat, alle Bits Rot. |
| [R8G8B8](#R8G8B8) | 24-bit-Pixelformat, 8 Bits für Rot, Grün und Blau. |
| [R8G8B8A8](#R8G8B8A8) | 32-bit-Pixelformat, 8 Bits für Rot, Grün, Blau und Alpha. |
| [SHORT_GR](#SHORT-GR) | 32-bit-Pixelformat, 16-bit Grün, 16-bit Rot |
| [SHORT_RGB](#SHORT-RGB) | 48-bit-Pixelformat, 16 Bits für Rot, Grün und Blau |
| [SHORT_RGBA](#SHORT-RGBA) | 64-bit-Pixelformat, 16 Bits für Rot, Grün, Blau und Alpha |
| [UNKNOWN](#UNKNOWN) | Unbekanntes Pixelformat. |
| [X8B8G8R8](#X8B8G8R8) | 32-bit-Pixelformat, 8 Bits für Blau, 8 Bits für Grün, 8 Bits für Rot wie A8B8G8R8, aber Alpha wird verworfen |
| [X8R8G8B8](#X8R8G8B8) | 32-bit-Pixelformat, 8 Bits für Rot, 8 Bits für Grün, 8 Bits für Blau wie A8R8G8B8, aber Alpha wird verworfen |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### A1R5G5B5 {#A1R5G5B5}
```
public static final PixelFormat A1R5G5B5
```


16‑Bit‑Pixelformat, 5 Bits für Blau, Grün, Rot und 1 Bit für Alpha.

### A2B10G10R10 {#A2B10G10R10}
```
public static final PixelFormat A2B10G10R10
```


32‑Bit‑Pixelformat, 10 Bits für Blau, Grün und Rot, 2 Bits für Alpha.

### A2R10G10B10 {#A2R10G10B10}
```
public static final PixelFormat A2R10G10B10
```


32‑Bit‑Pixelformat, 2 Bits für Alpha, 10 Bits für Rot, Grün und Blau.

### A4L4 {#A4L4}
```
public static final PixelFormat A4L4
```


8‑Bit‑Pixelformat, 4 Bits Alpha, 4 Bits Luminanz.

### A4R4G4B4 {#A4R4G4B4}
```
public static final PixelFormat A4R4G4B4
```


16‑Bit‑Pixelformat, 4 Bits für Alpha, Rot, Grün und Blau.

### A8 {#A8}
```
public static final PixelFormat A8
```


8‑Bit‑Pixelformat, alle Bits Alpha.

### A8B8G8R8 {#A8B8G8R8}
```
public static final PixelFormat A8B8G8R8
```


32‑Bit‑Pixelformat, 8 Bits für Blau, Grün, Rot und Alpha.

### A8R8G8B8 {#A8R8G8B8}
```
public static final PixelFormat A8R8G8B8
```


32‑Bit‑Pixelformat, 8 Bits für Alpha, Rot, Grün und Blau.

### B5G6R5 {#B5G6R5}
```
public static final PixelFormat B5G6R5
```


16‑Bit‑Pixelformat, 5 Bits Rot, 6 Bits Grün, 5 Bits Blau.

### B8 {#B8}
```
public static final PixelFormat B8
```


8‑Bit‑Pixelformat, alle Bits Blau.

### B8G8R8 {#B8G8R8}
```
public static final PixelFormat B8G8R8
```


24‑Bit‑Pixelformat, 8 Bits für Blau, Grün und Rot.

### B8G8R8A8 {#B8G8R8A8}
```
public static final PixelFormat B8G8R8A8
```


32‑Bit‑Pixelformat, 8 Bits für Blau, Grün, Rot und Alpha.

### BYTE_LA {#BYTE-LA}
```
public static final PixelFormat BYTE_LA
```


2‑Byte‑Pixelformat, 1 Byte Luminanz, 1 Byte Alpha.

### DEPTH {#DEPTH}
```
public static final PixelFormat DEPTH
```


Depth-Texturformat.

### DXT1 {#DXT1}
```
public static final PixelFormat DXT1
```


DDS (DirectDraw Surface) DXT1-Format.

### DXT2 {#DXT2}
```
public static final PixelFormat DXT2
```


DDS (DirectDraw Surface) DXT2-Format.

### DXT3 {#DXT3}
```
public static final PixelFormat DXT3
```


DDS (DirectDraw Surface) DXT3-Format.

### DXT4 {#DXT4}
```
public static final PixelFormat DXT4
```


DDS (DirectDraw Surface) DXT4-Format.

### DXT5 {#DXT5}
```
public static final PixelFormat DXT5
```


DDS (DirectDraw Surface) DXT5-Format.

### FLOAT16_GR {#FLOAT16-GR}
```
public static final PixelFormat FLOAT16_GR
```


32-bit, 2-Kanal s10e5 Gleitkomma-Pixelformat, 16-bit Grün, 16-bit Rot

### FLOAT16_R {#FLOAT16-R}
```
public static final PixelFormat FLOAT16_R
```


16-bit-Pixelformat, 16 Bits (float) für Rot

### FLOAT16_RGB {#FLOAT16-RGB}
```
public static final PixelFormat FLOAT16_RGB
```


48-bit-Pixelformat, 16 Bits (float) für Rot, 16 Bits (float) für Grün, 16 Bits (float) für Blau

### FLOAT16_RGBA {#FLOAT16-RGBA}
```
public static final PixelFormat FLOAT16_RGBA
```


64-bit-Pixelformat, 16 Bits (float) für Rot, 16 Bits (float) für Grün, 16 Bits (float) für Blau, 16 Bits (float) für Alpha

### FLOAT32_GR {#FLOAT32-GR}
```
public static final PixelFormat FLOAT32_GR
```


64-bit, 2-Kanal Gleitkomma-Pixelformat, 32-bit Grün, 32-bit Rot

### FLOAT32_R {#FLOAT32-R}
```
public static final PixelFormat FLOAT32_R
```


32-bit-Pixelformat, 32 Bits (float) für Rot

### FLOAT32_RGB {#FLOAT32-RGB}
```
public static final PixelFormat FLOAT32_RGB
```


96-bit-Pixelformat, 32 Bits (float) für Rot, 32 Bits (float) für Grün, 32 Bits (float) für Blau

### FLOAT32_RGBA {#FLOAT32-RGBA}
```
public static final PixelFormat FLOAT32_RGBA
```


128-bit-Pixelformat, 32 Bits (float) für Rot, 32 Bits (float) für Grün, 32 Bits (float) für Blau, 32 Bits (float) für Alpha

### G8 {#G8}
```
public static final PixelFormat G8
```


8-bit-Pixelformat, alle Bits Grün.

### L16 {#L16}
```
public static final PixelFormat L16
```


16-bit-Pixelformat, alle Bits Luminanz.

### L8 {#L8}
```
public static final PixelFormat L8
```


8-bit-Pixelformat, alle Bits Luminanz.

### R32G32B32A32_UINT {#R32G32B32A32-UINT}
```
public static final PixelFormat R32G32B32A32_UINT
```


128-bit-Pixelformat, 32 Bits Rot (unsigned int), 32 Bits Blau (unsigned int), 32 Bits Grün (unsigned int), 32 Bits Alpha (unsigned int).

### R32G32_UINT {#R32G32-UINT}
```
public static final PixelFormat R32G32_UINT
```


64-bit-Pixelformat, 32 Bits Rot (unsigned int), 32 Bits Blau (unsigned int).

### R32_UINT {#R32-UINT}
```
public static final PixelFormat R32_UINT
```


32-bit-Pixelformat, 32 Bits Rot (unsigned int).

### R3G3B2 {#R3G3B2}
```
public static final PixelFormat R3G3B2
```


8-bit-Pixelformat, 2 Bits Blau, 3 Bits Grün, 3 Bits Rot.

### R5G6B5 {#R5G6B5}
```
public static final PixelFormat R5G6B5
```


16‑Bit‑Pixelformat, 5 Bits Rot, 6 Bits Grün, 5 Bits Blau.

### R8 {#R8}
```
public static final PixelFormat R8
```


8-bit-Pixelformat, alle Bits Rot.

### R8G8B8 {#R8G8B8}
```
public static final PixelFormat R8G8B8
```


24-bit-Pixelformat, 8 Bits für Rot, Grün und Blau.

### R8G8B8A8 {#R8G8B8A8}
```
public static final PixelFormat R8G8B8A8
```


32-bit-Pixelformat, 8 Bits für Rot, Grün, Blau und Alpha.

### SHORT_GR {#SHORT-GR}
```
public static final PixelFormat SHORT_GR
```


32-bit-Pixelformat, 16-bit Grün, 16-bit Rot

### SHORT_RGB {#SHORT-RGB}
```
public static final PixelFormat SHORT_RGB
```


48-bit-Pixelformat, 16 Bits für Rot, Grün und Blau

### SHORT_RGBA {#SHORT-RGBA}
```
public static final PixelFormat SHORT_RGBA
```


64-bit-Pixelformat, 16 Bits für Rot, Grün, Blau und Alpha

### UNKNOWN {#UNKNOWN}
```
public static final PixelFormat UNKNOWN
```


Unbekanntes Pixelformat.

### X8B8G8R8 {#X8B8G8R8}
```
public static final PixelFormat X8B8G8R8
```


32-bit-Pixelformat, 8 Bits für Blau, 8 Bits für Grün, 8 Bits für Rot wie A8B8G8R8, aber Alpha wird verworfen

### X8R8G8B8 {#X8R8G8B8}
```
public static final PixelFormat X8R8G8B8
```


32-bit-Pixelformat, 8 Bits für Rot, 8 Bits für Grün, 8 Bits für Blau wie A8R8G8B8, aber Alpha wird verworfen

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PixelFormat valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[PixelFormat](../../com.aspose.threed/pixelformat)
### values() {#values--}
```
public static PixelFormat[] values()
```




**Returns:**
com.aspose.threed.PixelFormat[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

