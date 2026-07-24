---
title: "System::Reflection::BindingFlags 열거형"
linktitle: "BindingFlags"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::BindingFlags 열거형. C++에서 멤버와 타입 검색 모드 및 바인딩을 정의합니다."
type: docs
weight: 1100
url: /ko/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


멤버와 타입 조회 모드 및 바인딩을 정의합니다.

```cpp
enum class BindingFlags
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Default | 0 | 특별한 옵션이 없습니다. |
| IgnoreCase | 1 | 항목을 찾을 때 이름의 대소문자를 무시합니다. |
| DeclaredOnly | 2 | 형식에 선언된 멤버만 검색하고 기본 형식에는 검색하지 않습니다. |
| Instance | 4 | 인스턴스 멤버를 검색합니다. |
| Static | 8 | 정적 멤버를 검색합니다. |
| Public | 16 | public 멤버를 검색합니다. |
| NonPublic | 32 | 비공개 멤버를 검색합니다. |
| FlattenHierarchy | 64 | 기본 형식의 public 및 protected 정적 멤버를 검색합니다. |
| InvokeMethod | 256 | 메서드를 호출합니다. |
| CreateInstance | 512 | 반사된 타입 인스턴스를 생성합니다. |
| GetField | 1024 | 필드 값을 가져옵니다. |
| SetField | 2048 | 필드 값을 설정합니다. |
| GetProperty | 4096 | 속성 값을 가져옵니다. |
| SetProperty | 8192 | 속성 값을 설정합니다. |
| PutDispProperty | 16384 | COM 속성을 설정합니다. |
| PutRefDispProperty | 32768 | COM 참조 속성을 설정합니다. |
| ExactBinding | 65536 | 형식 바인딩은 정확해야 하며, 어떠한 형식 변경도 허용되지 않습니다. |
| SuppressChangeType | 131072 | 지원되지 않습니다. |
| OptionalParamBinding | 262144 | 인수 개수를 기준으로 오버로드를 선택합니다. |
| IgnoreReturn | 16777216 | COM 상호 운용 반환 값을 무시합니다. |

## 또 보기

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
