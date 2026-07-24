---
title: "System::Threading::Tasks::Task::Task 생성자"
linktitle: "Task"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::Task::Task 생성자. C++에서 초기화되지 않은 작업을 생성하기 위한 내부 생성자입니다."
type: docs
weight: 100
url: /ko/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


초기화되지 않은 작업을 만들기 위한 내부 생성자입니다.

```cpp
System::Threading::Tasks::Task::Task()
```

## 또 보기

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


상태를 가진 액션 및 상태 객체와 함께 [Task](../)을 생성합니다.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 실행할 액션 (상태 객체를 받음) |
| 상태 | const SharedPtr\<Object\>\& | 액션에 전달되는 사용자 정의 상태 객체 |

## 또 보기

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


상태를 가진 액션, 상태 및 취소 토큰과 함께 [Task](../)을 생성합니다.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 실행할 액션 (상태 객체를 받음) |
| 상태 | const SharedPtr\<Object\>\& | 액션에 전달되는 사용자 정의 상태 객체 |
| cancellationToken | const CancellationToken\& | 취소 요청을 모니터링하는 토큰 |

## 또 보기

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


실행할 액션과 함께 [Task](../)을 생성합니다.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| action | const Action<>\& | 비동기적으로 실행할 액션 |

## 또 보기

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


액션 및 취소 토큰과 함께 [Task](../)을 생성합니다.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| action | const Action<>\& | 비동기적으로 실행할 액션 |
| cancellationToken | const CancellationToken\& | 취소 요청을 모니터링하는 토큰 |

## 또 보기

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
