---
title: "System::Threading::Tasks::Task::Task कंस्ट्रक्टर"
linktitle: "Task"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Tasks::Task::Task कंस्ट्रक्टर। C++ में अनइनिशियलाइज़्ड टास्क बनाने के लिए आंतरिक कंस्ट्रक्टर।"
type: docs
weight: 100
url: /hi/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


अप्रारंभित कार्यों को बनाने के लिए आंतरिक कंस्ट्रक्टर।

```cpp
System::Threading::Tasks::Task::Task()
```

## संबंधित देखें

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


एक [Task](../) को एक स्टेटफुल एक्शन और स्टेट ऑब्जेक्ट के साथ बनाता है।

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | चलाने के लिए एक्शन (स्टेट ऑब्जेक्ट को स्वीकार करता है) |
| स्थिति | const SharedPtr\<Object\>\& | एक्शन को पास किया गया उपयोगकर्ता-परिभाषित स्टेट ऑब्जेक्ट |

## संबंधित देखें

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


एक [Task](../) को स्टेटफुल एक्शन, स्टेट, और कैंसलेशन टोकन के साथ बनाता है।

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | चलाने के लिए एक्शन (स्टेट ऑब्जेक्ट को स्वीकार करता है) |
| स्थिति | const SharedPtr\<Object\>\& | एक्शन को पास किया गया उपयोगकर्ता-परिभाषित स्टेट ऑब्जेक्ट |
| cancellationToken | const CancellationToken\& | कैंसलेशन अनुरोधों की निगरानी के लिए टोकन |

## संबंधित देखें

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


एक [Task](../) को चलाने के लिए एक एक्शन के साथ बनाता है।

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| action | const Action<>\& | असिंक्रोनस रूप से चलाने के लिए एक्शन |

## संबंधित देखें

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


एक [Task](../) को एक एक्शन और कैंसलेशन टोकन के साथ बनाता है।

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| action | const Action<>\& | असिंक्रोनस रूप से चलाने के लिए एक्शन |
| cancellationToken | const CancellationToken\& | कैंसलेशन अनुरोधों की निगरानी के लिए टोकन |

## संबंधित देखें

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
