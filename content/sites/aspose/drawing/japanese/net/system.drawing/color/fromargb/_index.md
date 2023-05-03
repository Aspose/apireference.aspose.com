---
title: Color.FromArgb
second_title: Aspose.Drawing for .NET API リファレンス
description: Color 方法. を作成しますColor32 ビット ARGB 値からの構造体.
type: docs
weight: 1430
url: /ja/net/system.drawing/color/fromargb/
---
## FromArgb(int) {#fromargb}

を作成しますColor32 ビット ARGB 値からの構造体.

```csharp
public static Color FromArgb(int argb)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| argb | Int32 | 32 ビット ARGB 値を指定する値。 |

### 戻り値

のColorこのメソッドが作成する構造。

### 関連項目

* struct [Color](../)
* 名前空間 [System.Drawing](../../color/)
* 組み立て [Aspose.Drawing](../../../)

---

## FromArgb(int, Color) {#fromargb_3}

を作成しますColor指定された構造Color構造体、 ですが、新しく指定されたアルファ値があります。このメソッドでは、アルファ値として 32 ビット値を渡すことができますが、 値は 8 ビットに制限されています.

```csharp
public static Color FromArgb(int alpha, Color baseColor)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| alpha | Int32 | 新しいのアルファ値Color.有効な値は 0 ～ 255 です。 |
| baseColor | Color | のColorそこから新しいものを作成するColor. |

### 戻り値

のColorこのメソッドが作成するもの。

### 関連項目

* struct [Color](../)
* 名前空間 [System.Drawing](../../color/)
* 組み立て [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int) {#fromargb_1}

を作成しますColor指定された 8 ビット カラー値 (赤、緑、青) からの構造体。 アルファ値は暗黙的に 255 (完全に不透明) です。各コンポーネントの値は 8 ビットに制限されています。

```csharp
public static Color FromArgb(int red, int green, int blue)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| red | Int32 | 新しいコンポーネントの赤のコンポーネント値Color.有効な値は 0 ～ 255 です。 |
| green | Int32 | 新しいのグリーン コンポーネント値Color.有効な値は 0 ～ 255 です。 |
| blue | Int32 | 新しいの青のコンポーネント値Color.有効な値は 0 ～ 255 です。 |

### 戻り値

のColorこのメソッドが作成するもの。

### 関連項目

* struct [Color](../)
* 名前空間 [System.Drawing](../../color/)
* 組み立て [Aspose.Drawing](../../../)

---

## FromArgb(int, int, int, int) {#fromargb_2}

4 つの ARGB コンポーネント (アルファ、赤、緑、および青) の値から Color 構造体を作成します。 .

```csharp
public static Color FromArgb(int alpha, int red, int green, int blue)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| alpha | Int32 | アルファ成分。有効な値は 0 ～ 255 です。 |
| red | Int32 | 赤のコンポーネント。有効な値は 0 ～ 255 です。 |
| green | Int32 | 緑のコンポーネント。有効な値は 0 ～ 255 です。 |
| blue | Int32 | 青の成分。有効な値は 0 ～ 255 です。 |

### 戻り値

このメソッドが作成する Color。

### 関連項目

* struct [Color](../)
* 名前空間 [System.Drawing](../../color/)
* 組み立て [Aspose.Drawing](../../../)


