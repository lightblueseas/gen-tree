/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.tree;

import java.util.ArrayList;
import java.util.List;

import io.github.astrapi69.tree.api.ITreeNode;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The generic class TreeNode.
 *
 * @param <T>
 *            the generic type
 */
@NoArgsConstructor
@EqualsAndHashCode(exclude = { "children" })
@ToString(exclude = { "children" })
public class TreeNode<T> implements ITreeNode<T>
{

	/**
	 * The serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The children. */
	@Setter
	private List<ITreeNode<T>> children;

	/** The optional display value. */
	@Getter
	@Setter
	private String displayValue;

	/** The parent from this node. If this is null it is the root. */
	@Getter
	@Setter
	private ITreeNode<T> parent;

	/** The value. */
	@Getter
	@Setter
	private T value;

	/**
	 * Instantiates a new tree node.
	 *
	 * @param value
	 *            the value
	 */
	public TreeNode(final T value)
	{
		setValue(value);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ITreeNode<T>> getChildren()
	{
		if (this.children == null)
		{
			this.children = new ArrayList<>();
		}
		return this.children;
	}

}
