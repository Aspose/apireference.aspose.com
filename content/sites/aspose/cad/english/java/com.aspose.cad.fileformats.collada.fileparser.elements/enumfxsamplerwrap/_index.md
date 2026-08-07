---
title: "EnumFxSamplerWrap"
linktitle: "EnumFxSamplerWrap"
second_title: "Aspose.CAD for Java"
description: "The enumeration FX sampler wrap."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/enumfxsamplerwrap/
---

The enumeration FX sampler wrap.

## Constructors

| Constructor | Description |
| --- | --- |
| [EnumFxSamplerWrap()](#EnumFxSamplerWrap) |  |

## Fields

| Field | Description |
| --- | --- |
| [WRAP](#WRAP) | The wrap. Tile the texture at every integer junction. For example, for u values between 0 and 3, the texture is repeated three times; no mirroring is performed. |
| [CLAMP](#CLAMP) | The clamp. Same as CLAMP_TO_EDGE. Texture coordinates reaching or exceeding the range [0.0, 1.0] are set just within 0.0 or 1.0 so that the boarder is not sampled. |
| [BORDER](#BORDER) | The border. Much like clamp except texture coordinates outside the range [0.0, 1.0] are set to the border color. |
| [MIRROR](#MIRROR) | The mirror. Texture is flipped at every integer junction. For u values between 0 and 1, for example, the texture is addressed normally; between 1 and 2, the texture is flipped (mirrored); between 2 and 3, the texture is normal again; and so on. |
| [MIRROR_ONCE](#MIRROR_ONCE) | The mirror once. Takes the absolute value of the texture coordinate (thus, mirroring around 0), and then clamps to the maximum value. |

### EnumFxSamplerWrap() {#EnumFxSamplerWrap}
```java
public EnumFxSamplerWrap()
```

### WRAP {#WRAP}
```java
public static final String WRAP
```

The wrap. Tile the texture at every integer junction. For example, for u values between 0 and 3, the texture is repeated three times; no mirroring is performed.

**Returns:** String

### CLAMP {#CLAMP}
```java
public static final String CLAMP
```

The clamp. Same as CLAMP_TO_EDGE. Texture coordinates reaching or exceeding the range [0.0, 1.0] are set just within 0.0 or 1.0 so that the boarder is not sampled.

**Returns:** String

### BORDER {#BORDER}
```java
public static final String BORDER
```

The border. Much like clamp except texture coordinates outside the range [0.0, 1.0] are set to the border color.

**Returns:** String

### MIRROR {#MIRROR}
```java
public static final String MIRROR
```

The mirror. Texture is flipped at every integer junction. For u values between 0 and 1, for example, the texture is addressed normally; between 1 and 2, the texture is flipped (mirrored); between 2 and 3, the texture is normal again; and so on.

**Returns:** String

### MIRROR_ONCE {#MIRROR_ONCE}
```java
public static final String MIRROR_ONCE
```

The mirror once. Takes the absolute value of the texture coordinate (thus, mirroring around 0), and then clamps to the maximum value.

**Returns:** String

