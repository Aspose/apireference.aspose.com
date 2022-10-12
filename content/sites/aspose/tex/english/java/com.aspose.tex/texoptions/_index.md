---
title: TeXOptions
second_title: Aspose.TeX for Java API Reference
description: TeX file processing options class.
type: docs
weight: 34
url: /java/com.aspose.tex/texoptions/
---
**Inheritance:**
java.lang.Object
```
public class TeXOptions
```

TeX file processing options class.
## Methods

| Method | Description |
| --- | --- |
| [getJobName()](#getJobName--) | Gets the name of the job. |
| [setJobName(String value)](#setJobName-java.lang.String-) | Sets the name of the job. |
| [getTerminalIn()](#getTerminalIn--) | Gets the input terminal reader. |
| [setTerminalIn(IInputTerminal value)](#setTerminalIn-com.aspose.tex.IInputTerminal-) | Sets the input terminal reader. |
| [getTerminalOut()](#getTerminalOut--) | Gets the output terminal writer. |
| [setTerminalOut(IOutputTerminal value)](#setTerminalOut-com.aspose.tex.IOutputTerminal-) | Sets the output terminal writer. |
| [getInputWorkingDirectory()](#getInputWorkingDirectory--) | Gets input working directory. |
| [setInputWorkingDirectory(IInputWorkingDirectory value)](#setInputWorkingDirectory-com.aspose.tex.IInputWorkingDirectory-) | Sets input working directory. |
| [getOutputWorkingDirectory()](#getOutputWorkingDirectory--) | Gets output working directory. |
| [setOutputWorkingDirectory(IOutputWorkingDirectory value)](#setOutputWorkingDirectory-com.aspose.tex.IOutputWorkingDirectory-) | Sets output working directory. |
| [getRequiredInputDirectory()](#getRequiredInputDirectory--) | Gets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support. |
| [setRequiredInputDirectory(IInputWorkingDirectory value)](#setRequiredInputDirectory-com.aspose.tex.IInputWorkingDirectory-) | Sets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support. |
| [getInteraction()](#getInteraction--) | Gets the interaction mode to run a TeX engine in. |
| [setInteraction(Interaction value)](#setInteraction-com.aspose.tex.Interaction-) | Sets the interaction mode to run a TeX engine in. |
| [ignoreMissingPackages()](#ignoreMissingPackages--) | Gets the flag that instructs the engine whether to halt on missing package read attempt or ignore it. |
| [ignoreMissingPackages(boolean value)](#ignoreMissingPackages-boolean-) | Sets the flag that instructs the engine whether to halt on missing package read attempt or ignore it. |
| [getSaveOptions()](#getSaveOptions--) | Gets options used for rendering into destination format (XPS, PDF, image, etc.). |
| [setSaveOptions(SaveOptions value)](#setSaveOptions-com.aspose.tex.rendering.SaveOptions-) | Sets options used for rendering into destination format (XPS, PDF, image, etc.). |
| [getDateTime()](#getDateTime--) | Gets a certain value for date/time primitives like \\year, \\month, \\day and \\time. |
| [setDateTime(Date value)](#setDateTime-java.util.Date-) | Sets a certain value for date/time primitives like \\year, \\month, \\day and \\time. |
| [repeat()](#repeat--) | Gets the flag indicating whether it is necessary to run the TeX job twice in case, for example, there are references in input TeX file(s). |
| [repeat(boolean value)](#repeat-boolean-) | Sets the flag indicating whether it is necessary to run the TeX job twice in case, for example, there are references in input TeX file(s). |
| [noLigatures()](#noLigatures--) | Gets the flag that cancels ligatures in all fonts. |
| [noLigatures(boolean value)](#noLigatures-boolean-) | Sets the flag that cancels ligatures in all fonts. |
| [consoleAppOptions(TeXConfig config)](#consoleAppOptions-com.aspose.tex.TeXConfig-) | Returns options for use in console application. |
### getJobName() {#getJobName--}
```
public String getJobName()
```


Gets the name of the job.

**Returns:**
java.lang.String - The name of the job.
### setJobName(String value) {#setJobName-java.lang.String-}
```
public void setJobName(String value)
```


Sets the name of the job.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The name of the job. |

### getTerminalIn() {#getTerminalIn--}
```
public IInputTerminal getTerminalIn()
```


Gets the input terminal reader.

**Returns:**
[IInputTerminal](../../com.aspose.tex/iinputterminal) - The input terminal reader.
### setTerminalIn(IInputTerminal value) {#setTerminalIn-com.aspose.tex.IInputTerminal-}
```
public void setTerminalIn(IInputTerminal value)
```


Sets the input terminal reader.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IInputTerminal](../../com.aspose.tex/iinputterminal) | The input terminal reader. |

### getTerminalOut() {#getTerminalOut--}
```
public IOutputTerminal getTerminalOut()
```


Gets the output terminal writer.

**Returns:**
[IOutputTerminal](../../com.aspose.tex/ioutputterminal) - The output terminal writer.
### setTerminalOut(IOutputTerminal value) {#setTerminalOut-com.aspose.tex.IOutputTerminal-}
```
public void setTerminalOut(IOutputTerminal value)
```


Sets the output terminal writer.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IOutputTerminal](../../com.aspose.tex/ioutputterminal) | The output terminal writer. |

### getInputWorkingDirectory() {#getInputWorkingDirectory--}
```
public IInputWorkingDirectory getInputWorkingDirectory()
```


Gets input working directory.

**Returns:**
[IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory) - Input working directory.
### setInputWorkingDirectory(IInputWorkingDirectory value) {#setInputWorkingDirectory-com.aspose.tex.IInputWorkingDirectory-}
```
public void setInputWorkingDirectory(IInputWorkingDirectory value)
```


Sets input working directory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory) | Input working directory. |

### getOutputWorkingDirectory() {#getOutputWorkingDirectory--}
```
public IOutputWorkingDirectory getOutputWorkingDirectory()
```


Gets output working directory.

**Returns:**
[IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory) - Output working directory.
### setOutputWorkingDirectory(IOutputWorkingDirectory value) {#setOutputWorkingDirectory-com.aspose.tex.IOutputWorkingDirectory-}
```
public void setOutputWorkingDirectory(IOutputWorkingDirectory value)
```


Sets output working directory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IOutputWorkingDirectory](../../com.aspose.tex/ioutputworkingdirectory) | Output working directory. |

### getRequiredInputDirectory() {#getRequiredInputDirectory--}
```
public IInputWorkingDirectory getRequiredInputDirectory()
```


Gets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support.

**Returns:**
[IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory) - Input directory.
### setRequiredInputDirectory(IInputWorkingDirectory value) {#setRequiredInputDirectory-com.aspose.tex.IInputWorkingDirectory-}
```
public void setRequiredInputDirectory(IInputWorkingDirectory value)
```


Sets the directory for the required input, e.g., packages that are beyond Aspose.TeX's LaTeX support.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory) | Input directory. |

### getInteraction() {#getInteraction--}
```
public Interaction getInteraction()
```


Gets the interaction mode to run a TeX engine in.

**Returns:**
[Interaction](../../com.aspose.tex/interaction) - The interaction mode to run a TeX engine in.
### setInteraction(Interaction value) {#setInteraction-com.aspose.tex.Interaction-}
```
public void setInteraction(Interaction value)
```


Sets the interaction mode to run a TeX engine in.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Interaction](../../com.aspose.tex/interaction) | The interaction mode to run a TeX engine in. |

### ignoreMissingPackages() {#ignoreMissingPackages--}
```
public boolean ignoreMissingPackages()
```


Gets the flag that instructs the engine whether to halt on missing package read attempt or ignore it.

**Returns:**
boolean - The flag that instructs the engine whether to halt on missing package read attempt or ignore it.
### ignoreMissingPackages(boolean value) {#ignoreMissingPackages-boolean-}
```
public void ignoreMissingPackages(boolean value)
```


Sets the flag that instructs the engine whether to halt on missing package read attempt or ignore it.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag that instructs the engine whether to halt on missing package read attempt or ignore it. |

### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Gets options used for rendering into destination format (XPS, PDF, image, etc.). Default value is the set of default options for rendering to XPS.

**Returns:**
[SaveOptions](../../com.aspose.tex.rendering/saveoptions) - Options used for rendering into destination format (XPS, PDF, image, etc.).
### setSaveOptions(SaveOptions value) {#setSaveOptions-com.aspose.tex.rendering.SaveOptions-}
```
public void setSaveOptions(SaveOptions value)
```


Sets options used for rendering into destination format (XPS, PDF, image, etc.). Default value is the set of default options for rendering to XPS.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [SaveOptions](../../com.aspose.tex.rendering/saveoptions) | Options used for rendering into destination format (XPS, PDF, image, etc.). |

### getDateTime() {#getDateTime--}
```
public Date getDateTime()
```


Gets a certain value for date/time primitives like \\year, \\month, \\day and \\time.

**Returns:**
java.util.Date - A certain value for date/time primitives like \\year, \\month, \\day and \\time.
### setDateTime(Date value) {#setDateTime-java.util.Date-}
```
public void setDateTime(Date value)
```


Sets a certain value for date/time primitives like \\year, \\month, \\day and \\time.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Date | A certain value for date/time primitives like \\year, \\month, \\day and \\time. |

### repeat() {#repeat--}
```
public boolean repeat()
```


Gets the flag indicating whether it is necessary to run the TeX job twice in case, for example, there are references in input TeX file(s). In general, this behavior is useful when the engine collects some data along the typesetting process and stores it in an auxilliary file, all at the first run. And at the second run, the engine somehow uses that data.

**Returns:**
boolean - The flag indicating whether it is necessary to run the TeX job twice.
### repeat(boolean value) {#repeat-boolean-}
```
public void repeat(boolean value)
```


Sets the flag indicating whether it is necessary to run the TeX job twice in case, for example, there are references in input TeX file(s). In general, this behavior is useful when the engine collects some data along the typesetting process and stores it in an auxilliary file, all at the first run. And at the second run, the engine somehow uses that data.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag indicating whether it is necessary to run the TeX job twice. |

### noLigatures() {#noLigatures--}
```
public boolean noLigatures()
```


Gets the flag that cancels ligatures in all fonts.

**Returns:**
boolean - The flag that cancels ligatures in all fonts.
### noLigatures(boolean value) {#noLigatures-boolean-}
```
public void noLigatures(boolean value)
```


Sets the flag that cancels ligatures in all fonts.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag that cancels ligatures in all fonts. |

### consoleAppOptions(TeXConfig config) {#consoleAppOptions-com.aspose.tex.TeXConfig-}
```
public static TeXOptions consoleAppOptions(TeXConfig config)
```


Returns options for use in console application.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| config | [TeXConfig](../../com.aspose.tex/texconfig) | A TeX configuration. |

**Returns:**
[TeXOptions](../../com.aspose.tex/texoptions) - TeX options.
