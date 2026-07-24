---
title: "System::Uri::MakeRelative 메서드"
linktitle: "MakeRelative"
second_title: "C++용 Aspose.Page"
description: "System::Uri::MakeRelative 메서드. C++에서 두 Uri 인스턴스 간의 차이를 결정합니다."
type: docs
weight: 3000
url: /ko/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


두 [Uri](../) 인스턴스 간의 차이를 결정합니다.

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | 현재 URI와 비교할 URI |

### ReturnValue

현재 객체와 **toUri**가 나타내는 URI의 호스트 이름과 스킴이 동일하면, 이 메서드는 현재 URI 인스턴스에 추가될 때 **toUri**를 생성하는 상대 [Uri](../)를 나타내는 [String](../../string/)을 반환합니다. 호스트 이름이나 스킴이 다르면, 이 메서드는 **uri** 매개변수를 나타내는 [String](../../string/)을 반환합니다.

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
