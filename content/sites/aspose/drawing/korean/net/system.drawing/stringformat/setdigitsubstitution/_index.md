---
title: StringFormat.SetDigitSubstitution
second_title: .NET API 참조용 Aspose.Drawing
description: StringFormat 방법. 로컬 숫자가 서부 숫자로 대체될 때 사용할 언어 및 방법을 지정합니다.
type: docs
weight: 140
url: /ko/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

로컬 숫자가 서부 숫자로 대체될 때 사용할 언어 및 방법을 지정합니다.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| language | Int32 | 현지 숫자가 서부 숫자로 대체될 때 사용될 언어 를 식별하는 자국어 지원(NLS) 언어 식별자입니다. 다음을 전달할 수 있습니다.LCID a 의 속성CultureInfo 객체를 NLS 언어 식별자로 사용합니다. 예를 들어,CultureInfo 문자열을 전달하는 object by `"ar-EG"` ~에게CultureInfo constructor. 를 전달하면LCID that 의 속성CultureInfo with 와 함께 객체Traditional to the Int32,StringDigitSubstitute) method, 표시 시간에 아라비아-인도 숫자가 서부 숫자로 대체됩니다. |
| substitute | StringDigitSubstitute | 의 요소StringDigitSubstitute 숫자가 표시되는 방법을 지정하는 열거형입니다. |

### 또한보십시오

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* 네임스페이스 [System.Drawing](../../stringformat/)
* 집회 [Aspose.Drawing](../../../)


