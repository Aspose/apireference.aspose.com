---
title: "System::Xml::XmlReader::ReadElementContentAsObject 方法"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject 方法。读取当前元素并将内容作为 Object 返回（C++）。"
type: docs
weight: 6200
url: /zh/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


读取当前元素并将内容作为 [Object](../../../system/object/) 返回。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

最合适类型的装箱对象。[XmlReader::get_ValueType](../get_valuetype/) 的值决定适当的类型。如果内容被标记为列表类型，此方法返回相应类型的装箱对象数组。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取当前元素并将内容作为 [Object](../../../system/object/) 返回。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 元素的本地名称。 |
| namespaceURI | String | 元素的命名空间 URI。 |

### ReturnValue

最合适类型的装箱对象。[XmlReader::get_ValueType](../get_valuetype/) 的值决定适当的类型。如果内容被标记为列表类型，此方法返回相应类型的装箱对象数组。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
