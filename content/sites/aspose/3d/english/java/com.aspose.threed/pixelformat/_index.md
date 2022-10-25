---
title: PixelFormat
second_title: Aspose.3D for Java API Reference
description: The pixels format used in texture unit.
type: docs
weight: 261
url: /java/com.aspose.threed/pixelformat/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PixelFormat extends Enum<PixelFormat>
```

The pixel's format used in texture unit.
## Fields

| Field | Description |
| --- | --- |
| [UNKNOWN](#UNKNOWN) | Unknown pixel format. |
| [L8](#L8) | 8-bit pixel format, all bits luminance. |
| [L16](#L16) | 16-bit pixel format, all bits luminance. |
| [A8](#A8) | 8-bit pixel format, all bits alpha. |
| [A4L4](#A4L4) | 8-bit pixel format, 4 bits alpha, 4 bits luminance. |
| [BYTE_LA](#BYTE-LA) | 2 byte pixel format, 1 byte luminance, 1 byte alpha |
| [R5G6B5](#R5G6B5) | 16-bit pixel format, 5 bits red, 6 bits green, 5 bits blue. |
| [B5G6R5](#B5G6R5) | 16-bit pixel format, 5 bits red, 6 bits green, 5 bits blue. |
| [R3G3B2](#R3G3B2) | 8-bit pixel format, 2 bits blue, 3 bits green, 3 bits red. |
| [A4R4G4B4](#A4R4G4B4) | 16-bit pixel format, 4 bits for alpha, red, green and blue. |
| [A1R5G5B5](#A1R5G5B5) | 16-bit pixel format, 5 bits for blue, green, red and 1 for alpha. |
| [R8G8B8](#R8G8B8) | 24-bit pixel format, 8 bits for red, green and blue. |
| [B8G8R8](#B8G8R8) | 24-bit pixel format, 8 bits for blue, green and red. |
| [A8R8G8B8](#A8R8G8B8) | 32-bit pixel format, 8 bits for alpha, red, green and blue. |
| [A8B8G8R8](#A8B8G8R8) | 32-bit pixel format, 8 bits for blue, green, red and alpha. |
| [B8G8R8A8](#B8G8R8A8) | 32-bit pixel format, 8 bits for blue, green, red and alpha. |
| [R8G8B8A8](#R8G8B8A8) | 32-bit pixel format, 8 bits for red, green, blue and alpha. |
| [X8R8G8B8](#X8R8G8B8) | 32-bit pixel format, 8 bits for red, 8 bits for green, 8 bits for blue like A8R8G8B8, but alpha will get discarded |
| [X8B8G8R8](#X8B8G8R8) | 32-bit pixel format, 8 bits for blue, 8 bits for green, 8 bits for red like A8B8G8R8, but alpha will get discarded |
| [A2R10G10B10](#A2R10G10B10) | 32-bit pixel format, 2 bits for alpha, 10 bits for red, green and blue. |
| [A2B10G10R10](#A2B10G10R10) | 32-bit pixel format, 10 bits for blue, green and red, 2 bits for alpha. |
| [DXT1](#DXT1) | DDS (DirectDraw Surface) DXT1 format. |
| [DXT2](#DXT2) | DDS (DirectDraw Surface) DXT2 format. |
| [DXT3](#DXT3) | DDS (DirectDraw Surface) DXT3 format. |
| [DXT4](#DXT4) | DDS (DirectDraw Surface) DXT4 format. |
| [DXT5](#DXT5) | DDS (DirectDraw Surface) DXT5 format. |
| [FLOAT16_R](#FLOAT16-R) | 16-bit pixel format, 16 bits (float) for red |
| [FLOAT16_RGB](#FLOAT16-RGB) | 48-bit pixel format, 16 bits (float) for red, 16 bits (float) for green, 16 bits (float) for blue |
| [FLOAT16_RGBA](#FLOAT16-RGBA) | 64-bit pixel format, 16 bits (float) for red, 16 bits (float) for green, 16 bits (float) for blue, 16 bits (float) for alpha |
| [FLOAT32_R](#FLOAT32-R) | 32-bit pixel format, 32 bits (float) for red |
| [FLOAT32_RGB](#FLOAT32-RGB) | 96-bit pixel format, 32 bits (float) for red, 32 bits (float) for green, 32 bits (float) for blue |
| [FLOAT32_RGBA](#FLOAT32-RGBA) | 128-bit pixel format, 32 bits (float) for red, 32 bits (float) for green, 32 bits (float) for blue, 32 bits (float) for alpha |
| [FLOAT16_GR](#FLOAT16-GR) | 32-bit, 2-channel s10e5 floating point pixel format, 16-bit green, 16-bit red |
| [FLOAT32_GR](#FLOAT32-GR) | 64-bit, 2-channel floating point pixel format, 32-bit green, 32-bit red |
| [DEPTH](#DEPTH) | Depth texture format. |
| [SHORT_RGBA](#SHORT-RGBA) | 64-bit pixel format, 16 bits for red, green, blue and alpha |
| [SHORT_GR](#SHORT-GR) | 32-bit pixel format, 16-bit green, 16-bit red |
| [SHORT_RGB](#SHORT-RGB) | 48-bit pixel format, 16 bits for red, green and blue |
| [R32_UINT](#R32-UINT) | 32-bit pixel format, 32 bits red (unsigned int). |
| [R32G32_UINT](#R32G32-UINT) | 64-bit pixel format, 32 bits red (unsigned int), 32 bits blue (unsigned int). |
| [R32G32B32A32_UINT](#R32G32B32A32-UINT) | 128-bit pixel format, 32 bits red (unsigned int), 32 bits blue (unsigned int), 32 bits green (unsigned int), 32 bits alpha (unsigned int). |
| [R8](#R8) | 8-bit pixel format, all bits red. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### UNKNOWN {#UNKNOWN}
```
public static final PixelFormat UNKNOWN
```


Unknown pixel format.

### L8 {#L8}
```
public static final PixelFormat L8
```


8-bit pixel format, all bits luminance.

### L16 {#L16}
```
public static final PixelFormat L16
```


16-bit pixel format, all bits luminance.

### A8 {#A8}
```
public static final PixelFormat A8
```


8-bit pixel format, all bits alpha.

### A4L4 {#A4L4}
```
public static final PixelFormat A4L4
```


8-bit pixel format, 4 bits alpha, 4 bits luminance.

### BYTE_LA {#BYTE-LA}
```
public static final PixelFormat BYTE_LA
```


2 byte pixel format, 1 byte luminance, 1 byte alpha

### R5G6B5 {#R5G6B5}
```
public static final PixelFormat R5G6B5
```


16-bit pixel format, 5 bits red, 6 bits green, 5 bits blue.

### B5G6R5 {#B5G6R5}
```
public static final PixelFormat B5G6R5
```


16-bit pixel format, 5 bits red, 6 bits green, 5 bits blue.

### R3G3B2 {#R3G3B2}
```
public static final PixelFormat R3G3B2
```


8-bit pixel format, 2 bits blue, 3 bits green, 3 bits red.

### A4R4G4B4 {#A4R4G4B4}
```
public static final PixelFormat A4R4G4B4
```


16-bit pixel format, 4 bits for alpha, red, green and blue.

### A1R5G5B5 {#A1R5G5B5}
```
public static final PixelFormat A1R5G5B5
```


16-bit pixel format, 5 bits for blue, green, red and 1 for alpha.

### R8G8B8 {#R8G8B8}
```
public static final PixelFormat R8G8B8
```


24-bit pixel format, 8 bits for red, green and blue.

### B8G8R8 {#B8G8R8}
```
public static final PixelFormat B8G8R8
```


24-bit pixel format, 8 bits for blue, green and red.

### A8R8G8B8 {#A8R8G8B8}
```
public static final PixelFormat A8R8G8B8
```


32-bit pixel format, 8 bits for alpha, red, green and blue.

### A8B8G8R8 {#A8B8G8R8}
```
public static final PixelFormat A8B8G8R8
```


32-bit pixel format, 8 bits for blue, green, red and alpha.

### B8G8R8A8 {#B8G8R8A8}
```
public static final PixelFormat B8G8R8A8
```


32-bit pixel format, 8 bits for blue, green, red and alpha.

### R8G8B8A8 {#R8G8B8A8}
```
public static final PixelFormat R8G8B8A8
```


32-bit pixel format, 8 bits for red, green, blue and alpha.

### X8R8G8B8 {#X8R8G8B8}
```
public static final PixelFormat X8R8G8B8
```


32-bit pixel format, 8 bits for red, 8 bits for green, 8 bits for blue like A8R8G8B8, but alpha will get discarded

### X8B8G8R8 {#X8B8G8R8}
```
public static final PixelFormat X8B8G8R8
```


32-bit pixel format, 8 bits for blue, 8 bits for green, 8 bits for red like A8B8G8R8, but alpha will get discarded

### A2R10G10B10 {#A2R10G10B10}
```
public static final PixelFormat A2R10G10B10
```


32-bit pixel format, 2 bits for alpha, 10 bits for red, green and blue.

### A2B10G10R10 {#A2B10G10R10}
```
public static final PixelFormat A2B10G10R10
```


32-bit pixel format, 10 bits for blue, green and red, 2 bits for alpha.

### DXT1 {#DXT1}
```
public static final PixelFormat DXT1
```


DDS (DirectDraw Surface) DXT1 format.

### DXT2 {#DXT2}
```
public static final PixelFormat DXT2
```


DDS (DirectDraw Surface) DXT2 format.

### DXT3 {#DXT3}
```
public static final PixelFormat DXT3
```


DDS (DirectDraw Surface) DXT3 format.

### DXT4 {#DXT4}
```
public static final PixelFormat DXT4
```


DDS (DirectDraw Surface) DXT4 format.

### DXT5 {#DXT5}
```
public static final PixelFormat DXT5
```


DDS (DirectDraw Surface) DXT5 format.

### FLOAT16_R {#FLOAT16-R}
```
public static final PixelFormat FLOAT16_R
```


16-bit pixel format, 16 bits (float) for red

### FLOAT16_RGB {#FLOAT16-RGB}
```
public static final PixelFormat FLOAT16_RGB
```


48-bit pixel format, 16 bits (float) for red, 16 bits (float) for green, 16 bits (float) for blue

### FLOAT16_RGBA {#FLOAT16-RGBA}
```
public static final PixelFormat FLOAT16_RGBA
```


64-bit pixel format, 16 bits (float) for red, 16 bits (float) for green, 16 bits (float) for blue, 16 bits (float) for alpha

### FLOAT32_R {#FLOAT32-R}
```
public static final PixelFormat FLOAT32_R
```


32-bit pixel format, 32 bits (float) for red

### FLOAT32_RGB {#FLOAT32-RGB}
```
public static final PixelFormat FLOAT32_RGB
```


96-bit pixel format, 32 bits (float) for red, 32 bits (float) for green, 32 bits (float) for blue

### FLOAT32_RGBA {#FLOAT32-RGBA}
```
public static final PixelFormat FLOAT32_RGBA
```


128-bit pixel format, 32 bits (float) for red, 32 bits (float) for green, 32 bits (float) for blue, 32 bits (float) for alpha

### FLOAT16_GR {#FLOAT16-GR}
```
public static final PixelFormat FLOAT16_GR
```


32-bit, 2-channel s10e5 floating point pixel format, 16-bit green, 16-bit red

### FLOAT32_GR {#FLOAT32-GR}
```
public static final PixelFormat FLOAT32_GR
```


64-bit, 2-channel floating point pixel format, 32-bit green, 32-bit red

### DEPTH {#DEPTH}
```
public static final PixelFormat DEPTH
```


Depth texture format.

### SHORT_RGBA {#SHORT-RGBA}
```
public static final PixelFormat SHORT_RGBA
```


64-bit pixel format, 16 bits for red, green, blue and alpha

### SHORT_GR {#SHORT-GR}
```
public static final PixelFormat SHORT_GR
```


32-bit pixel format, 16-bit green, 16-bit red

### SHORT_RGB {#SHORT-RGB}
```
public static final PixelFormat SHORT_RGB
```


48-bit pixel format, 16 bits for red, green and blue

### R32_UINT {#R32-UINT}
```
public static final PixelFormat R32_UINT
```


32-bit pixel format, 32 bits red (unsigned int).

### R32G32_UINT {#R32G32-UINT}
```
public static final PixelFormat R32G32_UINT
```


64-bit pixel format, 32 bits red (unsigned int), 32 bits blue (unsigned int).

### R32G32B32A32_UINT {#R32G32B32A32-UINT}
```
public static final PixelFormat R32G32B32A32_UINT
```


128-bit pixel format, 32 bits red (unsigned int), 32 bits blue (unsigned int), 32 bits green (unsigned int), 32 bits alpha (unsigned int).

### R8 {#R8}
```
public static final PixelFormat R8
```


8-bit pixel format, all bits red.

### values() {#values--}
```
public static PixelFormat[] values()
```




**Returns:**
com.aspose.threed.PixelFormat[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PixelFormat valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PixelFormat](../../com.aspose.threed/pixelformat)
