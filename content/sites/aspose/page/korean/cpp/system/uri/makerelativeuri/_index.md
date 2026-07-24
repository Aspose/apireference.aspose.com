---
title: "System::Uri::MakeRelativeUri method"
linktitle: "MakeRelativeUri"
second_title: "C++용 Aspose.Page"
description: "System::Uri::MakeRelativeUri 메서드. 현재 객체와 지정된 Uri 객체가 나타내는 URI 간의 차이를 C++에서 결정합니다."
type: docs
weight: 3100
url: /ko/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


현재 객체와 지정된 [Uri](../) 객체가 나타내는 URI 간의 차이를 결정합니다.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 비교 대상 |

### ReturnValue

현재 객체가 나타내는 URI와 **toUri**가 나타내는 URI의 호스트 이름 및 스키마가 동일하면, 이 메서드는 현재 URI 인스턴스에 추가될 때 **toUri**가 되는 상대 [Uri](../)를 반환합니다. 호스트 이름이나 스키마가 다르면, 이 메서드는 **uri** 매개변수를 나타내는 [Uri](../) 객체를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
