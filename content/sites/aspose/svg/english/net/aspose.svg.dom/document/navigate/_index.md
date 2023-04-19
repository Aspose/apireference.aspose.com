---
title: Document.Navigate
second_title: Aspose.SVG for .NET API Reference
description: Document method. Loads the document at the specified Uniform Resource Locator URL into the current instance replacing the previous content
type: docs
weight: 1010
url: /net/aspose.svg.dom/document/navigate/
---
## Navigate(string) {#navigate_4}

Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content.

```csharp
public void Navigate(string address)
```

| Parameter | Type | Description |
| --- | --- | --- |
| address | String | The document address. It will be combined with the current directory path to form an absolute URL. |

### See Also

* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(Url) {#navigate_1}

Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content.

```csharp
public void Navigate(Url url)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | The document URL. |

### See Also

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(string, string) {#navigate_6}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.

```csharp
public void Navigate(string content, string baseUri)
```

| Parameter | Type | Description |
| --- | --- | --- |
| content | String | The document content. |
| baseUri | String | The base URI to resolve relative resources. It will be combined with the current directory path to form an absolute URL. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | `baseUri` is `null`. |

### See Also

* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(string, Url) {#navigate_5}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.

```csharp
public void Navigate(string content, Url baseUri)
```

| Parameter | Type | Description |
| --- | --- | --- |
| content | String | The document content. |
| baseUri | Url | The base URI to resolve relative resources. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | `baseUri` is `null`. |

### See Also

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(Stream, string) {#navigate_3}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream.

```csharp
public void Navigate(Stream content, string baseUri)
```

| Parameter | Type | Description |
| --- | --- | --- |
| content | Stream | The document content. |
| baseUri | String | The base URI to resolve relative resources. It will be combined with the current directory path to form an absolute URL. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | `baseUri` is `null`. |

### See Also

* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(Stream, Url) {#navigate_2}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content. Document loading starts from the current position in the stream.

```csharp
public void Navigate(Stream content, Url baseUri)
```

| Parameter | Type | Description |
| --- | --- | --- |
| content | Stream | The document content. |
| baseUri | Url | The base URI to resolve relative resources. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | `baseUri` is `null`. |

### See Also

* class [Url](../../../aspose.svg/url/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)

---

## Navigate(RequestMessage) {#navigate}

Loads the document based on specified request object, replacing the previous content.

```csharp
public void Navigate(RequestMessage request)
```

| Parameter | Type | Description |
| --- | --- | --- |
| request | RequestMessage | The request object that is used to load document content. |

### See Also

* class [RequestMessage](../../../aspose.svg.net/requestmessage/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../document/)
* assembly [Aspose.SVG](../../../)
