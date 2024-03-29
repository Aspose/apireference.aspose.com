---
title: TryGetPropertyString
second_title: Aspose.Email for .NET API 参考
description: 尝试将属性数据作为具有指定标签和代码页的字符串获取
type: docs
weight: 170
url: /zh/net/aspose.email.mapi/mapipropertycontainer/trygetpropertystring/
---
## TryGetPropertyString(long, int) {#trygetpropertystring_3}

尝试将属性数据作为具有指定标签和代码页的字符串获取。

```csharp
public string TryGetPropertyString(long tag, int codepage)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tag | Int64 | 属性标签键。 |
| codepage | Int32 | 代码页。 |

### 返回值

包含属性数据内容的字符串。

### 也可以看看

* class [MapiPropertyContainer](../../mapipropertycontainer)
* 命名空间 [Aspose.Email.Mapi](../../mapipropertycontainer)
* 部件 [Aspose.Email](../../../)

---

## TryGetPropertyString(long) {#trygetpropertystring_2}

尝试获取属性数据作为带有指定标签的字符串。

```csharp
public string TryGetPropertyString(long tag)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tag | Int64 | 属性标签键。 |

### 返回值

包含属性数据内容的字符串。

### 也可以看看

* class [MapiPropertyContainer](../../mapipropertycontainer)
* 命名空间 [Aspose.Email.Mapi](../../mapipropertycontainer)
* 部件 [Aspose.Email](../../../)

---

## TryGetPropertyString(long, ref string, int) {#trygetpropertystring_1}

以字符串类型获取指定属性的值。 返回值表示操作是否成功。

```csharp
public bool TryGetPropertyString(long tag, ref string value, int codepage)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tag | Int64 | MAPI 属性标记。 |
| value | String& | 当此方法返回时，如果该属性存在，则包含指定属性的值 。此参数未初始化传递。 |
| codepage | Int32 | 用于获取字符串值的指定代码页。 |

### 返回值

如果 s 转换成功，则为 true；否则为假。

### 也可以看看

* class [MapiPropertyContainer](../../mapipropertycontainer)
* 命名空间 [Aspose.Email.Mapi](../../mapipropertycontainer)
* 部件 [Aspose.Email](../../../)

---

## TryGetPropertyString(long, ref string) {#trygetpropertystring}

以字符串类型获取指定属性的值。 返回值表示操作是否成功。

```csharp
public bool TryGetPropertyString(long tag, ref string value)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| tag | Int64 | MAPI 属性标记。 |
| value | String& | 当此方法返回时，如果该属性存在，则包含 指定属性的值。 此参数未初始化传递。 |

### 返回值

如果 s 转换成功，则为 true；否则为假。

### 也可以看看

* class [MapiPropertyContainer](../../mapipropertycontainer)
* 命名空间 [Aspose.Email.Mapi](../../mapipropertycontainer)
* 部件 [Aspose.Email](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
