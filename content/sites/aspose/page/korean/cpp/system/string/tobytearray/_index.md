---
title: "System::String::ToByteArray 메서드"
linktitle: "ToByteArray"
second_title: "C++용 Aspose.Page"
description: "System::String::ToByteArray 메서드. C++에서 문자열 또는 부분 문자열을 바이트 배열로 변환합니다."
type: docs
weight: 4700
url: /ko/cpp/system/string/tobytearray/
---
## String::ToByteArray method


문자열 또는 하위 문자열을 바이트 배열로 변환합니다.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startIndex | int32_t | 부분 문자열 시작 인덱스. |
| 길이 | int32_t | 부분 문자열 길이. |
| LE | bool | true이면 작은 엔디안으로 문자를 인코딩하고, 그렇지 않으면 큰 엔디안으로 인코딩합니다. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
