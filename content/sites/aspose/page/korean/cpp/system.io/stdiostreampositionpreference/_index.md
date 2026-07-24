---
title: "System::IO::STDIOStreamPositionPreference 열거형"
linktitle: "STDIOStreamPositionPreference"
second_title: "C++용 Aspose.Page"
description: "System::IO::STDIOStreamPositionPreference 열거형. C++에서 래퍼를 생성할 때 std::basic_iostream 및 그 파생 클래스들이 읽기와 쓰기 위치가 서로 다를 경우, 스트림에서 공통적인 읽기 및 쓰기 위치로 선호되는 위치를 결정합니다."
type: docs
weight: 3600
url: /ko/cpp/system.io/stdiostreampositionpreference/
---
## STDIOStreamPositionPreference enum


std::basic_iostream 및 그 파생 클래스가 래퍼 생성 시 서로 다른 읽기·쓰기 위치를 갖게 될 때, 스트림에서 공통 읽기·쓰기 위치로 선호되는 위치를 결정합니다.

```cpp
enum class STDIOStreamPositionPreference
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 0 | 0 | Zero 위치가 읽기 및 쓰기 위치로 설정됩니다. |
| ReadPosition | 1 | gptr 위치가 읽기 및 쓰기 위치로 설정됩니다. |
| WritePosition | 2 | pptr 위치가 읽기 및 쓰기 위치로 설정됩니다. |

## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
