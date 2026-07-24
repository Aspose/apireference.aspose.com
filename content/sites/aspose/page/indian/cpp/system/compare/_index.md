---
title: "System::Compare मेथड"
linktitle: "Compare"
second_title: "Aspose.Page C++ के लिए"
description: "System::Compare मेथड। C++ में दो मानों की तुलना करता है।"
type: docs
weight: 15800
url: /hi/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


दो मानों की तुलना करता है।

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| पैरामीटर | विवरण |
| --- | --- |
| TA | पहले तुलना मान का प्रकार |
| TB | दूसरे तुलना मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | const TA\& | पहला तुलनात्मक मान |
| b | const TB\& | दूसरा तुलनात्मक मान |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


दो फ्लोटिंग पॉइंट मानों की तुलना करता है।

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| पैरामीटर | विवरण |
| --- | --- |
| TA | पहले तुलना मान का प्रकार |
| TB | दूसरे तुलना मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | const TA\& | पहला तुलनात्मक मान |
| b | const TB\& | दूसरा तुलनात्मक मान |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
