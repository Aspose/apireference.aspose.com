---
title: HTMLDocument.Save
second_title: Aspose.HTML for Java API Reference
description: HTMLDocument method. Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder whose name will be constructed as output_file_name  _files
type: docs

url: /java/com.aspose.html/htmldocument/save/
---
## Save(Url) {#save_5}

Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as output_file_name + "_files".

```java
public void Save(Url url)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | Local [`URL`](../../url/) to output file. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(Url) Method

It is necessary to specify a full Url path - 'outputFilePath' for HTML document saving. The Url(url) constructor creates an instance of the [`Url`](../../url/) class with the specified url. Then you should pass the instance to the Save(Url) method. The document will be saved to the local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as output_file_name + "_files".

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
        
	var outputFilePath = Path.Combine(outputHtmlPath, "result.html");
	document.Save(new Url(outputFilePath));
}
```

*inputHtmlPath - user input html file.

*outputHtmlPath - user output folder path.

### See Also

* class [Url](../../url/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(ResourceHandler) {#save}

Saves the document content and resources using the [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/).

```java
public void Save(ResourceHandler resourceHandler)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resourceHandler | ResourceHandler | The resource handler [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/). |

### See Also

* class [ResourceHandler](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(String) {#save_10}

Saves the document to a local file specified by path. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(String path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Local file system path to output file. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(String) method takes as a parameter a local file system path to an output file and saves an HTML document to the local file specified by path. All resources used in the document will be saved into an adjacent folder.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
...
 using (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (outputHtmlPath == null)
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.html");
	document.Save(outputFilePath);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output directory path.

### See Also

* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(String, HTMLSaveFormat) {#save_11}

Saves the document to a local file specified by path. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as output_file_name + "_files".

```java
public void Save(String path, HTMLSaveFormat saveFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Local file path to output file. |
| saveFormat | HTMLSaveFormat | Format in which document is saved. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(String, HTMLSaveFormat) Method

Save(String, HTMLSaveFormat) method takes as parameters a local file system path to output file and saveFormat. The [`HTMLSaveFormat`](../../../com.aspose.html.saving/htmlsaveformat/) Enumeration specifies the format in which document is saved, it can be HTML, MHTML and MD formats. The method saves the HTML document in the specified format to the local file specified by path. All resources used in the document will be saved into an adjacent folder.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
# HTML input file content
<!DOCTYPE html>
<html lang="en"
   xmlns:xml="http://www.w3.org/XML/1998/package">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="styles/main.css">
  <title>Title</title>
</head>
<body>
<div id="uniqueIdentifier">Container with ID - identifier</div>
<div class="custom-class">Customized by css class container</div>

<div>
  <p class="pStyle">First styled by pStyle class paragraph</p>
  <p class="pStyle">Second styled by pStyle class paragraph</p>
  <p class="pStyle">Third styled by pStyle class paragraph</p>
  <span class="pStyle">Span styled by pStyle</span>
</div>

<math xmlns="http://www.w3.org/1998/Math/MathML">
  <mrow>...</mrow>
</math>

<div id="smart class">
  <p id="p1" class="ddd kkk">Paragraph styled by class name =ddd kkk=</p>
  <p id="p2" class="ddd fff">Paragraph styled by class name =ddd fff=</p>
  <p id="p3" class="kkk fff">Paragraph styled by class name =kkk fff=</p>
</div>

</body>
</html>

# C# code
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}
	var outputFilePath = Path.Combine(outputHtmlPath, "result.mhtml");
	document.Save(outputFilePath, HTMLSaveFormat.MHTML);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output folder path.

# Content of result file

MIME-Version: 1.0

Content-Type: Multipart/related; boundary="boundary";type=Text/HTML

--boundary

Content-Type: text/html;

Content-Location: result.mhtml

&lt;!DOCTYPE html&gt;&lt;html lang="en" xmlns:xml="http://www.w3.org/XML/1998/package"&gt;&lt;head&gt;

&lt;meta charset="UTF-8"&gt;

&lt;link rel="stylesheet" href="main.css"&gt;

&lt;title&gt;Title&lt;/title&gt;

&lt;/head&gt;

&lt;body&gt;

&lt;div id="uniqueIdentifier"&gt;Container with ID - identifier&lt;/div&gt;

&lt;div class="custom-class"&gt;Customized by css class container&lt;/div&gt;

&lt;div&gt;

&lt;p class="pStyle"&gt;First styled by pStyle class paragraph&lt;/p&gt;

&lt;p class="pStyle"&gt;Second styled by pStyle class paragraph&lt;/p&gt;

&lt;p class="pStyle"&gt;Third styled by pStyle class paragraph&lt;/p&gt;

&lt;span class="pStyle"&gt;Span styled by pStyle&lt;/span&gt;

&lt;/div&gt;

&lt;math xmlns="http://www.w3.org/1998/Math/MathML"&gt;

&lt;mrow&gt;...&lt;/mrow&gt;

&lt;/math&gt;

&lt;div id="smart class"&gt;

&lt;p id="p1" class="ddd kkk"&gt;Paragraph styled by class name =ddd kkk=&lt;/p&gt;

&lt;p id="p2" class="ddd fff"&gt;Paragraph styled by class name =ddd fff=&lt;/p&gt;

&lt;p id="p3" class="kkk fff"&gt;Paragraph styled by class name =kkk fff=&lt;/p&gt;

&lt;/div&gt;

&lt;div&gt;Hello from DIV element&lt;/div&gt;&lt;/body&gt;&lt;/html&gt;

--boundary

Content-Type: text/css;

Content-Location: main.css

.custom-class { color: yellow; background-color: blueviolet; margin-top: 10pt; margin-right: 10pt; margin-bottom: 10pt; margin-left: 10pt; }.pStyle { font-

--boundary--

### See Also

* enum [HTMLSaveFormat](../../../com.aspose.html.saving/htmlsaveformat/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(Url, HTMLSaveFormat) {#save_6}

Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as output_file_name + "_files".

```java
public void Save(Url url, HTMLSaveFormat saveFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | Local URL to output file. |
| saveFormat | HTMLSaveFormat | Format in which document is saved. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(Url, HTMLSaveFormat) Method

It is necessary to specify a full Url path - 'outputFilePath' for HTML document saving. The Url(url) constructor creates an instance of the [`Url`](../../url/) class with the specified url. The [`HTMLSaveFormat`](../../../com.aspose.html.saving/htmlsaveformat/) Enumeration specifies the format in which document is saved, it can be HTML, MHTML and MD formats. Then you should pass the parameters to the Save(url, saveFormat) method. The document will be saved in the specified format to the local file specified by url.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.mhtml");
	document.Save(new Url(outputFilePath), HTMLSaveFormat.MHTML);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output directory path.

### See Also

* class [Url](../../url/)
* enum [HTMLSaveFormat](../../../com.aspose.html.saving/htmlsaveformat/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(ResourceHandler, HTMLSaveFormat) {#save_1}

Saves the document content and resources using the [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/).

```java
public void Save(ResourceHandler resourceHandler, HTMLSaveFormat saveFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resourceHandler | ResourceHandler | The resource handler [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/). |
| saveFormat | HTMLSaveFormat | Format in which document is saved. |

### See Also

* class [ResourceHandler](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/)
* enum [HTMLSaveFormat](../../../com.aspose.html.saving/htmlsaveformat/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(String, HTMLSaveOptions) {#save_12}

Saves the document to a local file specified by path. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(String path, HTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Local path to output file. |
| saveOptions | HTMLSaveOptions | [`HTMLSaveOptions`](../../../com.aspose.html.saving/htmlsaveoptions/) object is for resource handling process management. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(String, HTMLSaveOptions) Method

Save(String, HTMLSaveOptions) method takes as parameters a local file system path to output file, an instance of [HTMLSaveOptions](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) class and saves an HTML document with resources to the local file specified by path. The HTMLSaveOptions() constructor creates a save options instance that has [`ResourceHandlingOptions`](../../../com.aspose.html.saving/htmlsaveoptions/) properties which are used for configuration of resources handling. All resources used in the document will be saved into an adjacent folder.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.html");
	// Define options class instance
	var options = new HTMLSaveOptions();
	// Pages handling restriction
	options.ResourceHandlingOptions.MaxHandlingDepth = 1;
	document.Save(outputFilePath, options);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output folder path.

### See Also

* class [HTMLSaveOptions](../../../com.aspose.html.saving/htmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(Url, HTMLSaveOptions) {#save_7}

Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(Url url, HTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | Local [`URL`](../../url/) to output file. |
| saveOptions | HTMLSaveOptions | [`HTMLSaveOptions`](../../../com.aspose.html.saving/htmlsaveoptions/) object is for resource handling process management. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(Url, HTMLSaveOptions) Method

It is necessary to specify a full Url path for HTML document saving. The Url(url) constructor creates an instance of the [`Url`](../../url/) class with the specified url. The HTMLSaveOptions() constructor creates an instance of [`HTMLSaveOptions`](../../../com.aspose.html.saving/htmlsaveoptions/) class that has ResourceHandlingOptions properties which are used for configuration of resources handling. The Save(url, saveOptions) method takes parameters and saves the HTML document with resources to the local file specified by url.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.html");
	// Define options class instance
	var options = new HTMLSaveOptions();
	// Pages handling restriction
	options.ResourceHandlingOptions.MaxHandlingDepth = 1;
	document.Save(new Url(outputFilePath), options);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output folder path.

### See Also

* class [Url](../../url/)
* class [HTMLSaveOptions](../../../com.aspose.html.saving/htmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(ResourceHandler, HTMLSaveOptions) {#save_2}

Saves the document content and resources using the [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/).

```java
public void Save(ResourceHandler resourceHandler, HTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resourceHandler | ResourceHandler | The resource handler [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/). |
| saveOptions | HTMLSaveOptions | HTML save options. |

### See Also

* class [ResourceHandler](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/)
* class [HTMLSaveOptions](../../../com.aspose.html.saving/htmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(String, MarkdownSaveOptions) {#save_13}

Saves the document to a local file specified by path. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(String path, MarkdownSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Local path to output file. |
| saveOptions | MarkdownSaveOptions | [`MarkdownSaveOptions`](../../../com.aspose.html.saving/markdownsaveoptions/) object usage enables you to tune the rendering process. For more info see the [Aspose Documentation](https://docs.aspose.com/html/net/converting-between-formats/html-to-markdown/#save-options). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(String, MarkdownSaveOptions) Method

It is necessary to specify a local file system path to the output file for document saving. The MarkdownSaveOptions() constructor creates an instance of [`MarkdownSaveOptions`](../../../com.aspose.html.saving/markdownsaveoptions/) class that has a set of properties. For example, you can set markdown formatting style, use predefined GitLab Flavored Markdown compatible options and configure resources handling. The Save(path, saveOptions) method takes the local file system path to output file and options instance as parameters and saves HTML as a Markdown document with resources to the local file specified by path.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
     
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.md");
	// Define options class instance
	var options = new MarkdownSaveOptions();
	document.Save(outputFilePath, options);
}
```

*inputHtmlPath - user input html file.

*outputHtmlPath - user output folder path.

### See Also

* class [MarkdownSaveOptions](../../../com.aspose.html.saving/markdownsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(Url, MarkdownSaveOptions) {#save_8}

Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(Url url, MarkdownSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | Local [`URL`](../../url/) to output file. |
| saveOptions | MarkdownSaveOptions | [`MarkdownSaveOptions`](../../../com.aspose.html.saving/markdownsaveoptions/) object usage enables you to tune the rendering process. For more info see the [documentation](https://docs.aspose.com/html/net/converting-between-formats/html-to-markdown/#save-options). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(Url, MarkdownSaveOptions) Method

It is necessary to specify a full Url path for document saving. The Url(url) constructor creates an instance of the [`Url`](../../url/) class with the specified url. The MarkdownSaveOptions() constructor creates an instance of [`MarkdownSaveOptions`](../../../com.aspose.html.saving/markdownsaveoptions/) class that has a set of properties. For example, you can set Markdown formatting style, use predefined GitLab Flavored Markdown compatible options and configure resources handling. The Save(url, saveOptions) method takes url and save options instances as parameters and saves the document with resources to the local file specified by url.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.md");
	// Define options class instance
	var options = new MarkdownSaveOptions();
	document.Save(new Url(outputFilePath), options);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output folder path.

### See Also

* class [Url](../../url/)
* class [MarkdownSaveOptions](../../../com.aspose.html.saving/markdownsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(ResourceHandler, MarkdownSaveOptions) {#save_3}

Saves the document content and resources using the [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/).

```java
public void Save(ResourceHandler resourceHandler, MarkdownSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resourceHandler | ResourceHandler | The resource handler [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/). |
| saveOptions | MarkdownSaveOptions | Markdown save options. |

### See Also

* class [ResourceHandler](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/)
* class [MarkdownSaveOptions](../../../com.aspose.html.saving/markdownsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(String, MHTMLSaveOptions) {#save_14}

Saves the document to a local file specified by path. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(String path, MHTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | Local path to output file. |
| saveOptions | MHTMLSaveOptions | [`MHTMLSaveOptions`](../../../com.aspose.html.saving/mhtmlsaveoptions/) object usage enables you to tune the rendering process. For more info see the [documentation](https://docs.aspose.com/html/net/converting-between-formats/html-to-mhtml/#save-options). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `path` is not a valid local file path. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(String, MHTMLSaveOptions) Method

It is necessary to specify a local file system path to the output file for document saving. The MHTMLSaveOptions() constructor initializes an instance of [`MHTMLSaveOptions`](../../../com.aspose.html.saving/mhtmlsaveoptions/) class that has the ResourceHandlingOptions property which is used for configuration of resources handling. The Save(path, saveOptions) method takes a local file system path to output file and a save options instance as parameters and saves HTML as an MHTML document to the local file specified by path.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.mhtm");
	// Define options class instance
	var options = new MHTMLSaveOptions();
	document.Save(outputFilePath, options);
}
```

*inputHtmlPath - user input html file path.

*outputHtmlPath - user output folder path.

### See Also

* class [MHTMLSaveOptions](../../../com.aspose.html.saving/mhtmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(Url, MHTMLSaveOptions) {#save_9}

Saves the document to a local file specified by url. All resources used in this document will be saved into an adjacent folder, whose name will be constructed as: output_file_name + "_files".

```java
public void Save(Url url, MHTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| url | Url | Local URL to output file. |
| saveOptions | MHTMLSaveOptions | [`MHTMLSaveOptions`](../../../com.aspose.html.saving/mhtmlsaveoptions/) object usage enables you to tune the rendering process. For more info see the [documentation](https://docs.aspose.com/html/net/converting-between-formats/html-to-mhtml/#save-options). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Raised if the specified `url` is not a valid local file URL. |

## Remarks

Save HTML

Most of the tasks, you need to perform, require saving a document. Once you load the existing file or create an HTML document from scratch, you can save your changes using one of HTMLDocument.Save() methods. The methods allow saving HTML to a local file specified by path, URL, or output storage. Refer to the [documentation](https://docs.aspose.com/html/net/working-with-documents/saving-a-document/) to learn more about saving.

Save(Url, MHTMLSaveOptions) Method

It is necessary to specify a full Url path for document saving. The Url(url) constructor creates an instance of the [`Url`](../../url/) class with the specified url. The MHTMLSaveOptions() constructor initializes an instance of [`MHTMLSaveOptions`](../../../com.aspose.html.saving/mhtmlsaveoptions/) class that has the  ResourceHandlingOptions property which is used for configuration of resources handling. The Save(url, saveOptions) method takes url and options as parameters and saves HTML as an MHTML document to the local file specified by url.

Source code

You can download the complete examples and data files from [GitHub](https://github.com/aspose-html/Aspose.HTML-Documentation).

## Examples

```java
import System;
import System.IO;
import Aspose.Html;
import com.aspose.html.saving;
...
import (var document = new HTMLDocument(inputHtmlPath))
{
	HTMLDivElement element = (HTMLDivElement) document.CreateElement("div");
	element.InnerHTML = "Hello from DIV element";
	document.Body.AppendChild(element);
         
	if (String.IsNullOrEmpty(outputHtmlPath))
	{
		throw new ArgumentException("Non valid path to output result");
	}

	var outputFilePath = Path.Combine(outputHtmlPath, "result.mhtm");
	// Define options class instance
	var options = new MHTMLSaveOptions();
	document.Save(new Url(outputFilePath), options);
}
```

*inputHtmlPath - user input file path.

*outputHtmlPath - user output folder path.

### See Also

* class [Url](../../url/)
* class [MHTMLSaveOptions](../../../com.aspose.html.saving/mhtmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)

---

## Save(ResourceHandler, MHTMLSaveOptions) {#save_4}

Saves the document content and resources using the [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/).

```java
public void Save(ResourceHandler resourceHandler, MHTMLSaveOptions saveOptions)
```

| Parameter | Type | Description |
| --- | --- | --- |
| resourceHandler | ResourceHandler | The resource handler [`ResourceHandler`](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/). |
| saveOptions | MHTMLSaveOptions | MHTML save options. |

### See Also

* class [ResourceHandler](../../../com.aspose.html.saving.resourcehandlers/resourcehandler/)
* class [MHTMLSaveOptions](../../../com.aspose.html.saving/mhtmlsaveoptions/)
* class [HTMLDocument](../)
* package [com.aspose.html](../../../com.aspose.html/)
* package [Aspose.HTML](../../../)
