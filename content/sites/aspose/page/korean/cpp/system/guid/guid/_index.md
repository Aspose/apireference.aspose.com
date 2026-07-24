---
title: "System::Guid::Guid 생성자"
linktitle: "Guid"
second_title: "C++용 Aspose.Page"
description: "System::Guid::Guid 생성자. C++에서 모든 0으로 구성된 GUID를 나타내는 객체를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/guid/guid/
---
## Guid::Guid() constructor


모든 값이 0인 GUID를 나타내는 객체를 생성합니다.

```cpp
System::Guid::Guid()
```

## 또 보기

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


부호 없는 8비트 정수 값 배열로 지정된 GUID를 나타내는 객체를 생성합니다.

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | GUID의 개별 바이트를 포함하는 바이트 배열 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const Guid\&) constructor


지정된 객체와 동일한 GUID를 나타내는 객체를 생성합니다.

```cpp
System::Guid::Guid(const Guid &guid)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| guid | const Guid\& | GUID 값을 복사할 [Guid](../) 객체 |

## 또 보기

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const String\&) constructor


문자열로 지정된 GUID를 나타내는 객체를 생성합니다.

```cpp
System::Guid::Guid(const String &g)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| g | const String\& | 구성 중인 객체가 나타낼 GUID의 문자열 표현 |

## 또 보기

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


부호 없는 8비트 정수 값 배열 뷰로 지정된 GUID를 나타내는 객체를 생성합니다.

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | GUID의 개별 바이트를 포함하는 바이트 배열 |

## 또 보기

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


지정된 GUID 구성 요소에서 [Guid](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | int32_t | GUID의 비트 0-31 |
| b | int16_t | GUID의 비트 32-47 |
| c | int16_t | GUID의 비트 48-63 |
| d | const ArrayPtr\<uint8_t\>\& | GUID의 비트 64-127을 포함하는 바이트 배열 |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


지정된 GUID 구성 요소에서 [Guid](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | int32_t | GUID의 비트 0-31 |
| b | int16_t | GUID의 비트 32-47 |
| c | int16_t | GUID의 비트 48-63 |
| d | const System::Details::ArrayView\<uint8_t\>\& | GUID의 비트 64-127을 포함하는 바이트 배열 뷰 |

## 또 보기

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


지정된 부호 없는 정수와 바이트에서 [Guid](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | int32_t | GUID의 비트 0-31 |
| b | int16_t | GUID의 비트 32-47 |
| c | int16_t | GUID의 비트 48-63 |
| d | uint8_t | GUID의 비트 64-71 |
| e | uint8_t | GUID의 비트 72-79 |
| f | uint8_t | GUID의 비트 80-87 |
| g | uint8_t | GUID의 비트 88-95 |
| h | uint8_t | GUID의 비트 96-103 |
| i | uint8_t | GUID의 비트 104-111 |
| j | uint8_t | GUID의 비트 112-119 |
| k | uint8_t | GUID의 비트 120-127 |

## 또 보기

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


지정된 부호 없는 정수와 바이트에서 [Guid](../) 클래스의 인스턴스를 생성합니다.

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | uint32_t | GUID의 비트 0-31 |
| b | uint16_t | GUID의 비트 32-47 |
| c | uint16_t | GUID의 비트 48-63 |
| d | uint8_t | GUID의 비트 64-71 |
| e | uint8_t | GUID의 비트 72-79 |
| f | uint8_t | GUID의 비트 80-87 |
| g | uint8_t | GUID의 비트 88-95 |
| h | uint8_t | GUID의 비트 96-103 |
| i | uint8_t | GUID의 비트 104-111 |
| j | uint8_t | GUID의 비트 112-119 |
| k | uint8_t | GUID의 비트 120-127 |

## 또 보기

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
