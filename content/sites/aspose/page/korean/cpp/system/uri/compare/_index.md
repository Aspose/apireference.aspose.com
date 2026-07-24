---
title: "System::Uri::Compare 메서드"
linktitle: "Compare"
second_title: "C++용 Aspose.Page"
description: "System::Uri::Compare 메서드. 지정된 비교 규칙을 사용하여 지정된 Uri 객체들을 비교합니다 (C++)."
type: docs
weight: 3500
url: /ko/cpp/system/uri/compare/
---
## Uri::Compare method


지정된 비교 규칙을 사용하여 지정된 [Uri](../) 객체들을 비교합니다.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 첫 번째 비교값 |
| uri2 | const SharedPtr\<Uri\>\& | 두 번째 비교값 |
| partsToCompare | UriComponents | 비교할 **uri1** 및 **uri2**의 부분을 지정합니다 |
| compareFormat | UriFormat | URI 구성 요소를 비교할 때 사용되는 문자 이스케이프 방식을 지정합니다 |
| comparisonType | StringComparison | [StringComparison](../../stringcomparison/) 값 중 하나 |

### ReturnValue

**uri1**이 **uri2**보다 작으면 음수값; uri1과 uri2가 같으면 0; **uri1**이 **uri2**보다 크면 양수값

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
