---
title: Metafile.Metafile
second_title: Aspose.Drawing for .NET API リファレンス
description: Metafile コンストラクタ. の新しいインスタンスを初期化しますMetafile指定されたハンドルのクラス.
type: docs
weight: 10
url: /ja/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

の新しいインスタンスを初期化します[`Metafile`](../)指定されたハンドルのクラス.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| henhmetafile | IntPtr | 拡張メタファイルへのハンドル。 |
| deleteEmf | Boolean | 拡張メタファイル ハンドルを削除する場合は trueMetafile削除されます。それ以外の場合は false。 |

### 関連項目

* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

の新しいインスタンスを初期化します[`Metafile`](../)指定されたハンドルからデバイス コンテキスト へのクラスとEmfTypeの形式を指定する列挙Metafile.

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| referenceHdc | IntPtr | デバイス コンテキストへのハンドル。 |
| emfType | EmfType | アンEmfTypeの形式を指定するMetafile. |

### 関連項目

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

の新しいインスタンスを初期化します[`Metafile`](../)指定したファイル名からのクラス.

```csharp
public Metafile(string filename)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filename | String | あStringこれは、新しいファイルを作成する元のファイル名 を表しますMetafile. |

### 関連項目

* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

の新しいインスタンスを初期化します[`Metafile`](../)指定したファイル名からのクラス.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| filename | String | あStringこれは、新しいファイルを作成する元のファイル名 を表しますMetafile. |
| referenceHdc | IntPtr | デバイス コンテキストへの Windows ハンドル。 |

### 関連項目

* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

の新しいインスタンスを初期化します[`Metafile`](../)指定されたデータストリームからのクラス.

```csharp
public Metafile(Stream stream)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | のStreamそこから create 新しいMetafile. |

### 関連項目

* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

の新しいインスタンスを初期化します[`Metafile`](../)指定された データ ストリームからのクラスと、デバイス コンテキストへの Windows ハンドル。 /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | あStreamこれには のデータが含まれていますMetafile. |
| referenceHdc | IntPtr | のデバイス コンテキストへの Windows ハンドルMetafile物体。 |

### 関連項目

* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

の新しいインスタンスを初期化します[`Metafile`](../)指定された データ ストリームからのクラス、デバイス コンテキストへの Windows ハンドル、およびEmfTypeの形式を指定する enumeration Metafile.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | あStreamこれには のデータが含まれていますMetafile. |
| referenceHdc | IntPtr | デバイス コンテキストへの Windows ハンドル。 |
| type | EmfType | アンEmfTypeの format を指定するMetafile. |

### 関連項目

* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

の新しいインスタンスを初期化します[`Metafile`](../)指定された データ ストリームからのクラス、デバイス コンテキストへの Windows ハンドル、およびEmfTypeの形式を指定する enumeration Metafile.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | Stream | あStreamこれには のデータが含まれていますMetafile. |
| referenceHdc | IntPtr | デバイス コンテキストへの Windows ハンドル。 |
| frameRect | RectangleF | あRectangle新しいものを囲む四角形を表すMetafile. |
| frameUnit | MetafileFrameUnit | あMetafileFrameUnitframeRect の測定単位を指定します。 |
| type | EmfType | アンEmfTypeの format を指定するMetafile. |

### 関連項目

* struct [RectangleF](../../../system.drawing/rectanglef/)
* enum [MetafileFrameUnit](../../metafileframeunit/)
* enum [EmfType](../../emftype/)
* class [Metafile](../)
* 名前空間 [System.Drawing.Imaging](../../metafile/)
* 組み立て [Aspose.Drawing](../../../)


