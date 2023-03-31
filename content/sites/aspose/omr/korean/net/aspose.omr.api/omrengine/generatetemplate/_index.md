---
title: OmrEngine.GenerateTemplate
second_title: .NET API 참조용 Aspose.OMR
description: OmrEngine 방법. MemoryStream 를 기반으로 템플릿.omr 및 템플릿 이미지를 생성합니다.
type: docs
weight: 40
url: /ko/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

MemoryStream 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다.

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 마크업 라인을 포함하는 스트림 |
| settings | GlobalPageSettings | 모든 페이지 요소에 적용되는 전역 설정 |
| userImages | ImageCollection | 템플릿 생성에 사용할 수 있는 이미지 모음입니다. 파일 시스템 대신 MemoryStream의 이미지를 사용하도록 허용 |
| encoding | Encoding | 마크업 라인 인코딩, 기본적으로 UTF-8이 사용됨 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

MemoryStream 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다.

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| stream | MemoryStream | 마크업 라인을 포함하는 스트림 |
| userImages | ImageCollection | 템플릿 생성에 사용할 수 있는 이미지 모음입니다. 파일 시스템 대신 MemoryStream의 이미지를 사용하도록 허용 |
| encoding | Encoding | 마크업 라인 인코딩, 기본적으로 UTF-8이 사용됨 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

마크업 lines 의 배열을 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다.

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| markupLines | String[] | 마크업 라인 배열 |
| settings | GlobalPageSettings | 모든 페이지 요소에 적용되는 전역 설정 |
| userImages | ImageCollection | 템플릿 생성에 사용할 수 있는 이미지 모음입니다. 파일 시스템 대신 MemoryStream의 이미지를 사용하도록 허용 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

마크업 lines 의 배열을 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다.

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| markupLines | String[] | 마크업 라인 배열 |
| userImages | ImageCollection | 템플릿 생성에 사용할 수 있는 이미지 모음입니다. 파일 시스템 대신 MemoryStream의 이미지를 사용하도록 허용 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| markupPath | String | 텍스트 마크업 파일 경로 |
| settings | GlobalPageSettings | 모든 페이지 요소에 적용되는 전역 설정 |
| encoding | Encoding | 마크업 파일 인코딩, 기본적으로 UTF-8이 사용됨 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| markupPath | String | 텍스트 마크업 파일 경로 |
| encoding | Encoding | 마크업 파일 인코딩, 기본적으로 UTF-8이 사용됨 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

텍스트 마크업을 기반으로 템플릿(.omr) 및 템플릿 이미지 생성

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| markupPath | String | 텍스트 마크업 파일 경로 |
| imagesPaths | String[] | 생성에 사용된 이미지의 전체 경로 |
| encoding | Encoding | 마크업 파일 인코딩, 기본적으로 UTF-8이 사용됨 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Template object 를 기반으로 템플릿(.omr) 및 템플릿 이미지를 생성합니다.

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| config | TemplateConfig | 모든 요소를 나타내는 템플릿 객체 |
| settings | GlobalPageSettings | 모든 템플릿 생성에 사용되는 전역 설정 |
| userImages | ImageCollection | 템플릿 생성에 사용할 수 있는 이미지 모음입니다. 파일 시스템 대신 MemoryStream의 이미지를 사용하도록 허용 |

### 반환 값

생성 결과

### 또한보십시오

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* 네임스페이스 [Aspose.OMR.Api](../../omrengine/)
* 집회 [Aspose.OMR](../../../)


