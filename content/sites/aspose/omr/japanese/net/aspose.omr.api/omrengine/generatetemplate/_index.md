---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR for .NET API リファレンス
description: OmrEngine 方法. テンプレート .omr とテンプレート イメージを MemoryStream に基づいて作成します
type: docs
weight: 40
url: /ja/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

テンプレート (.omr) とテンプレート イメージを MemoryStream に基づいて作成します。

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | マークアップ行を含むストリーム |
| settings | GlobalPageSettings | すべてのページ要素に適用可能なグローバル設定 |
| userImages | ImageCollection | テンプレートの生成に使用できる画像のコレクション。ファイル システムの代わりに MemoryStream からのイメージの使用を許可する |
| encoding | Encoding | マークアップ行のエンコーディング。デフォルトでは UTF-8 が使用されます |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

テンプレート (.omr) とテンプレート イメージを MemoryStream に基づいて作成します。

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| stream | MemoryStream | マークアップ行を含むストリーム |
| userImages | ImageCollection | テンプレートの生成に使用できる画像のコレクション。ファイル システムの代わりに MemoryStream からのイメージの使用を許可する |
| encoding | Encoding | マークアップ行のエンコーディング。デフォルトでは UTF-8 が使用されます |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

マークアップ行の配列に基づいてテンプレート (.omr) とテンプレート イメージを作成します

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| markupLines | String[] | マークアップ行の配列 |
| settings | GlobalPageSettings | すべてのページ要素に適用可能なグローバル設定 |
| userImages | ImageCollection | テンプレートの生成に使用できる画像のコレクション。ファイル システムの代わりに MemoryStream からのイメージの使用を許可する |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

マークアップ行の配列に基づいてテンプレート (.omr) とテンプレート イメージを作成します

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| markupLines | String[] | マークアップ行の配列 |
| userImages | ImageCollection | テンプレートの生成に使用できる画像のコレクション。ファイル システムの代わりに MemoryStream からのイメージの使用を許可する |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| markupPath | String | テキスト マークアップ ファイルへのパス |
| settings | GlobalPageSettings | すべてのページ要素に適用可能なグローバル設定 |
| encoding | Encoding | マークアップ ファイルのエンコーディング。デフォルトでは UTF-8 が使用されます |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| markupPath | String | テキスト マークアップ ファイルへのパス |
| encoding | Encoding | マークアップ ファイルのエンコーディング。デフォルトでは UTF-8 が使用されます |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

テキスト マークアップに基づいてテンプレート (.omr) とテンプレート イメージを作成します

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| markupPath | String | テキスト マークアップ ファイルへのパス |
| imagesPaths | String[] | 生成に使用されるイメージへのフル パス |
| encoding | Encoding | マークアップ ファイルのエンコーディング。デフォルトでは UTF-8 が使用されます |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

テンプレート object に基づいてテンプレート (.omr) とテンプレート イメージを作成します。

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| config | TemplateConfig | すべての要素を表すテンプレート オブジェクト |
| settings | GlobalPageSettings | すべてのテンプレート生成で使用されるグローバル設定 |
| userImages | ImageCollection | テンプレートの生成に使用できる画像のコレクション。ファイル システムの代わりに MemoryStream からのイメージの使用を許可する |

### 戻り値

生成結果

### 関連項目

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 名前空間 [Aspose.OMR.Api](../../omrengine/)
* 組み立て [Aspose.OMR](../../../)


