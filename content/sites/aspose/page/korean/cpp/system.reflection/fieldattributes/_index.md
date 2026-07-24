---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::FieldAttributes 열거형. C++에서 반영된 필드 특성."
type: docs
weight: 1200
url: /ko/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


리플렉션된 필드 속성.

```cpp
enum class FieldAttributes
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| FieldAccessMask | 7 | 멤버 접근 마스크. 이 마스크를 사용하여 접근성 정보를 검색합니다. |
| PrivateScope | 0 | 참조할 수 없는 멤버. |
| Private | 1 | 비공개 멤버. |
| FamANDAssem | 2 | 비공개 및 어셈블리 범위 멤버. |
| Assembly | 3 | 어셈블리 범위 멤버. |
| Family | 4 | 형식 및 하위 형식에서 접근 가능한 멤버. |
| FamORAssem | 5 | 형식, 하위 형식 및 어셈블리에서 접근 가능한 멤버. |
| Public | 6 | 누구나 접근 가능한 멤버. |
| Static | 16 | 인스턴스 멤버와 반대되는 정적 멤버. |
| InitOnly | 32 | 초기화만 가능하고 변경할 수 없는 상수 멤버. |
| Literal | 64 | 컴파일 시간 상수 멤버. |
| NotSerialized | 128 | 직렬화되지 않은 멤버. |
| SpecialName | 512 | 아래 이름 중 하나의 특수 필드입니다. |
| PinvokeImpl | 8192 | Interop 전달 구현. |
| ReservedMask | 38144 | 런타임에서만 사용하도록 예약된 플래그입니다. |
| RTSpecialName | 1024 | 런타임은 이름 인코딩을 확인해야 합니다. |
| HasFieldMarshal | 4096 | 마샬링 정보가 존재합니다. |
| HasDefault | 32768 | 기본값이 존재합니다. |
| HasFieldRVA | 256 | RVA가 존재합니다. |

## 또 보기

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
