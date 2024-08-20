---
title: TeXOptions class
second_title: Aspose.TeX for Python via .NET API Reference
description: 
type: docs
weight: 70
url: /tex/python-net/aspose.tex/texoptions/
---

## TeXOptions class

TeX file processing options class.



The TeXOptions type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `job_name` | Gets/set the name of the job. |
| `terminal_in` | Gets/sets the input terminal reader. |
| `terminal_out` | Gets/sets the output terminal writer. |
| `input_working_directory` | Gets/sets input working directory. |
| `output_working_directory` | Gets/sets output working directory. |
| `required_input_directory` | Gets/sets the directory for the required input, e.g.,<br/>            packages that are beyond Aspose.TeX's LaTeX support. |
| `interaction` | Gets/sets the interaction mode to run a TeX engine in. |
| `ignore_missing_packages` | Gets/sets the flag that instructs the engine whether to halt<br/>            on missing package read attempt or ignore it. |
| `save_options` | Gets/sets options used for rendering into destination format (XPS, PDF, image, etc.).<br/>            Default value is the set of default options for rendering to XPS. |
| `date_time` | Gets/sets a certain value for date/time primitives like \year, \month, \day and \time. |
| `repeat` | Gets/sets the flag that indicates whether it is necessary to run the TeX job twice in case,<br/>            for example, there are references in input TeX file(s). In general, this behavior is useful when<br/>            the engine collects some data along the typesetting process and stores it in an auxilliary file,<br/>            all at the first run. And at the second run, the engine somehow uses that data. |
| `no_ligatures` | Gets/sets the flag that cancels ligatures in all fonts. |
| `full_input_file_names` | Gets/sets the flag indicating whether full or short filenames are output<br/>            to the transcript file and to the terminal when file input begins. |
| `shell_mode` | Determines the availability of \write18. |
| `executables` | A customizable collection of objects that emulate executables, which can be executed using the \write18 commands in Object TeX. |
## Methods
| Name | Description |
| :- | :- |
| `console_app_options(config)` | Returns options for use in a console application. |

### See Also

* module [`aspose.tex`](/tex/python-net/aspose.tex/)
* package [`aspose.tex`](/tex/python-net/)

