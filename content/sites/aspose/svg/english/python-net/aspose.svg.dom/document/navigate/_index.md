---
title: navigate method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 360
url: /python-net/aspose.svg.dom/document/navigate/
is_root: false
---

## navigate {#str}

Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content.



```python
def navigate(self, address):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| address | str | The document address. It will be combined with the current directory path to form an absolute URL. |


## navigate {#aspose.svg.Url}

Loads the document at the specified Uniform Resource Locator (URL) into the current instance, replacing the previous content.



```python
def navigate(self, url):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| url | [`Url`](/svg/python-net/aspose.svg/url) | The document URL. |


## navigate {#aspose.svg.net.RequestMessage}

Loads the document based on specified request object, replacing the previous content.



```python
def navigate(self, request):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| request | aspose.svg.net.RequestMessage | The request object that is used to load document content. |


## navigate {#str-str}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.



```python
def navigate(self, content, base_uri):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| content | str | The document content. |
| base_uri | str | The base URI to resolve relative resources. It will be combined with the current directory path to form an absolute URL. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | `baseUri` is `null`. |




## navigate {#str-aspose.svg.Url}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.



```python
def navigate(self, content, base_uri):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| content | str | The document content. |
| base_uri | [`Url`](/svg/python-net/aspose.svg/url) | The base URI to resolve relative resources. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | `baseUri` is `null`. |




## navigate {#io.RawIOBase-str}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.
Document loading starts from the current position in the stream.



```python
def navigate(self, content, base_uri):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| content | io.RawIOBase | The document content. |
| base_uri | str | The base URI to resolve relative resources. It will be combined with the current directory path to form an absolute URL. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | `baseUri` is `null`. |




## navigate {#io.RawIOBase-aspose.svg.Url}

Loads the document from specified content and using baseUri to resolve relative resources, replacing the previous content.
Document loading starts from the current position in the stream.



```python
def navigate(self, content, base_uri):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| content | io.RawIOBase | The document content. |
| base_uri | [`Url`](/svg/python-net/aspose.svg/url) | The base URI to resolve relative resources. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | `baseUri` is `null`. |





### See Also
* module [`aspose.svg.dom`](../../)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
