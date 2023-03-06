---
title: VectorMapLayer.ImportSld
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorMapLayer 방법. 지정된 경로에 있는 Styled Layer Descriptor 파일에서 스타일을 가져옵니다.
type: docs
weight: 60
url: /ko/net/aspose.gis.rendering/vectormaplayer/importsld/
---
## ImportSld(string, SldImportOptions) {#importsld_1}

지정된 경로에 있는 Styled Layer Descriptor 파일에서 스타일을 가져옵니다.

```csharp
public void ImportSld(string path, SldImportOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | Styled Layer Descriptor 파일의 경로입니다. |
| options | SldImportOptions | 가져오기 옵션. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| XmlException | XML을 구문 분석하는 동안 오류가 발생했습니다. |
| FormatException | XML에서 SLD 스타일을 찾을 수 없습니다. |

### 비고

이 방법은[`Symbolizer`](../symbolizer/) 속성.

### 또한보십시오

* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)

---

## ImportSld(AbstractPath, SldImportOptions) {#importsld}

지정된 경로에 있는 Styled Layer Descriptor 파일에서 스타일을 가져옵니다.

```csharp
public void ImportSld(AbstractPath path, SldImportOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | Styled Layer Descriptor 파일의 경로입니다. |
| options | SldImportOptions | 가져오기 옵션. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| XmlException | XML을 구문 분석하는 동안 오류가 발생했습니다. |
| FormatException | XML에서 SLD 스타일을 찾을 수 없습니다. |

### 비고

이 방법은[`Symbolizer`](../symbolizer/) 속성.

### 또한보십시오

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [SldImportOptions](../../../aspose.gis.rendering.sld/sldimportoptions/)
* class [VectorMapLayer](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../vectormaplayer/)
* 집회 [Aspose.GIS](../../../)


