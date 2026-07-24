---
title: "System::DoTryFinally 메서드"
linktitle: "DoTryFinally"
second_title: "C++용 Aspose.Page"
description: "System::DoTryFinally 메서드. C#''s try[-catch]-finally 문문의 동작을 에뮬레이트하는 단일 함수입니다. 번역기 옵션 finally_statement_as_lambda가 true로 설정된 상태에서 C#''s try[-catch]-finally 문을 번역할 경우, 해당 문은 C++에서 이 메서드 호출로 변환됩니다."
type: docs
weight: 16500
url: /ko/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


C#'s try[-catch]-finally 문문의 동작을 에뮬레이트하는 단일 함수입니다. 번역기 옵션 finally_statement_as_lambda가 true로 설정된 상태에서 C#'s try[-catch]-finally 문을 번역할 경우, 해당 문은 이 메서드 호출로 변환됩니다.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분을 구현하는 함수 객체의 타입 |
| F | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분을 구현하는 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| tryBlock | T\&& | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분 구현을 포함하는 함수 객체 |
| finallyBlock | F\&& | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분 구현을 포함하는 함수 객체 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#'s try[-catch]-finally 문문의 동작을 에뮬레이트하는 단일 함수입니다. 번역기 옵션 finally_statement_as_lambda가 true로 설정된 상태에서 C#'s try[-catch]-finally 문을 번역할 경우, 해당 문은 이 메서드 호출로 변환됩니다. 이 오버로드는 try[-catch]-finally 문에서 try[-catch] 부분을 구현하는 함수 객체의 반환값이 bool인 경우를 처리합니다.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분을 구현하는 함수 객체의 타입 |
| F | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분을 구현하는 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| tryBlock | T\&& | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분 구현을 포함하는 함수 객체 |
| finallyBlock | F\&& | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분 구현을 포함하는 함수 객체 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


C#의 try[-catch]-finally 문 동작을 에뮬레이트하는 단일 함수입니다. 번역 옵션 finally_statement_as_lambda 를 true 로 설정한 상태에서 C#의 try[-catch]-finally 문을 번역하면, 해당 문은 이 메서드 호출로 변환됩니다. 이 오버로드는 try[-catch]-finally 문의 try[-catch] 부분을 구현하는 함수 객체의 반환값이 bool&인 경우를 처리합니다.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분을 구현하는 함수 객체의 타입 |
| F | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분을 구현하는 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| tryBlock | T\&& | 에뮬레이트되는 try[-catch]-finally 문에서 try[-catch] 부분 구현을 포함하는 함수 객체 |
| finallyBlock | F\&& | 에뮬레이트되는 try[-catch]-finally 문에서 finally 부분 구현을 포함하는 함수 객체 |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
