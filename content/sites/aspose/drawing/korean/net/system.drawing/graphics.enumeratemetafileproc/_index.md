---
title: Delegate Graphics.EnumerateMetafileProc
second_title: .NET API 참조용 Aspose.Drawing
description: 에 대한 콜백 메소드를 제공합니다.EnumerateMetafile 방법.
type: docs
weight: 550
url: /ko/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

에 대한 콜백 메소드를 제공합니다.[`EnumerateMetafile`](../graphics/enumeratemetafile/) 방법.

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| recordType | EmfPlusRecordType | 회원[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/) 메타파일 레코드의 유형을 지정하는 열거형입니다. |
| flags | Int32 | 레코드의 속성을 지정하는 플래그 집합입니다. |
| dataSize | Int32 | 레코드 데이터의 바이트 수. |
| data | IntPtr | 레코드 데이터를 포함하는 버퍼에 대한 포인터입니다. |
| callbackData | PlayRecordCallback | 인수는 사용되지 않습니다. |

### 반환 값

레코드를 계속 열거하려면 true를 반환합니다. 그렇지 않으면 거짓입니다.

### 또한보십시오

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


