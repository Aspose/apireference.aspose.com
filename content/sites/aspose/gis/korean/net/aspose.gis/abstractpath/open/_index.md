---
title: AbstractPath.Open
second_title: .NET API 참조를 위한 Aspose.GIS
description: AbstractPath 방법. 이것을 엽니다추상경로파일로.
type: docs
weight: 120
url: /ko/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

이것을 엽니다`추상경로`파일로.

```csharp
public abstract Stream Open(FileAccess access)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| access | FileAccess | 수행할 수 있는 작업의 하위 집합을 지정합니다.Stream. |

### 반환 값

ㅏStream 지정된 상태로 열림FileAccess .

### 비고

경우*access* 깃발을 가지고Write 파일이 존재하지 않으면 상속자가 파일을 만들어야 합니다. 안`추상경로` 의해 여러 번 열 수 있습니다.`Aspose.GIS` . 이는 여러 스트림과 독립적으로 file 를 읽기 위해 필요합니다. 결과를 캐시하지 말고 new를 반환해야 합니다.Stream 매번 이 메서드가 호출됩니다.

### 또한보십시오

* class [AbstractPath](../)
* 네임스페이스 [Aspose.Gis](../../abstractpath/)
* 집회 [Aspose.GIS](../../../)


