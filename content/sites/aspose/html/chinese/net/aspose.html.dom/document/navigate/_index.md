---
title: Document.Navigate
second_title: Aspose.HTML for .NET API 参考
description: Document 方法. 将指定统一资源定位符 URL 处的文档加载到当前实例中替换之前的内容
type: docs
weight: 1010
url: /zh/net/aspose.html.dom/document/navigate/
---
## Navigate(string) {#navigate_4}

将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。

```csharp
public void Navigate(string address)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| address | String | 文档地址。它将与当前目录路径组合成一个绝对URL。 |

### 也可以看看

* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(Url) {#navigate_1}

将指定统一资源定位符 (URL) 处的文档加载到当前实例中，替换之前的内容。

```csharp
public void Navigate(Url url)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| url | Url | 文档网址。 |

### 也可以看看

* class [Url](../../../aspose.html/url/)
* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(string, string) {#navigate_6}

从指定内容加载文档并使用baseUri 解析相关资源，替换之前的内容.

```csharp
public void Navigate(string content, string baseUri)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| content | String | 文档内容。 |
| baseUri | String | 解析相关资源的基本 URI。它将与当前目录路径组合成一个绝对URL。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | `基础Uri`是`无效的`. |

### 也可以看看

* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(string, Url) {#navigate_5}

从指定内容加载文档并使用baseUri 解析相关资源，替换之前的内容.

```csharp
public void Navigate(string content, Url baseUri)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| content | String | 文档内容。 |
| baseUri | Url | 解析相关资源的基本 URI。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | `基础Uri`是`无效的`. |

### 也可以看看

* class [Url](../../../aspose.html/url/)
* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(Stream, string) {#navigate_3}

从指定内容加载文档并使用baseUri 解析相对资源，替换之前的内容。 从流中的当前位置开始加载文档。

```csharp
public void Navigate(Stream content, string baseUri)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| content | Stream | 文档内容。 |
| baseUri | String | 解析相关资源的基本 URI。它将与当前目录路径组合成一个绝对URL。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | `基础Uri`是`无效的`. |

### 也可以看看

* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(Stream, Url) {#navigate_2}

从指定内容加载文档并使用baseUri 解析相对资源，替换之前的内容。 从流中的当前位置开始加载文档。

```csharp
public void Navigate(Stream content, Url baseUri)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| content | Stream | 文档内容。 |
| baseUri | Url | 解析相关资源的基本 URI。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | `基础Uri`是`无效的`. |

### 也可以看看

* class [Url](../../../aspose.html/url/)
* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)

---

## Navigate(RequestMessage) {#navigate}

根据指定的请求对象加载文档，替换之前的内容。

```csharp
public void Navigate(RequestMessage request)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| request | RequestMessage | 用于加载文档内容的请求对象。 |

### 也可以看看

* class [RequestMessage](../../../aspose.html.net/requestmessage/)
* class [Document](../)
* 命名空间 [Aspose.Html.Dom](../../document/)
* 部件 [Aspose.HTML](../../../)


