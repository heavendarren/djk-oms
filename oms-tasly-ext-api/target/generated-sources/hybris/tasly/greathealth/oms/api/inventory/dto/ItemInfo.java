

/*
 * [y] hybris Core+ Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */

package tasly.greathealth.oms.api.inventory.dto;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import java.io.Serializable;
import com.hybris.commons.dto.impl.PropertyAwareEntityDto;
/**
* ItemInfo DTO for oms-extension
* Generated automatically
* @author: dto-generator, [y] hybris Platform
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ItemInfo extends PropertyAwareEntityDto implements Serializable
{

	public final static long serialVersionUID = 624251279L;

	@XmlID
	private String sku;

	private String description;

	private int quantity;

	private String baseUnitCode;

	private int stockManageFlag;

	private InventoryInnerSource innerSource;

	private String oldMaterialNumber;

	private String ext1;

	private String ext2;

	private String ext3;

	private String ext4;

	private String ext5;

	private String vendor;

	
	public ItemInfo(){}

	protected ItemInfo(Builder builder)
	{
		super(builder); 
		setSku(builder.getSku());
		setDescription(builder.getDescription());
		setQuantity(builder.getQuantity());
		setBaseUnitCode(builder.getBaseUnitCode());
		setStockManageFlag(builder.getStockManageFlag());
		setInnerSource(builder.getInnerSource());
		setOldMaterialNumber(builder.getOldMaterialNumber());
		setExt1(builder.getExt1());
		setExt2(builder.getExt2());
		setExt3(builder.getExt3());
		setExt4(builder.getExt4());
		setExt5(builder.getExt5());
		setVendor(builder.getVendor());
	
	}

				
	@Override
	public String getId()
	{
		return this.sku;
	}
				
			

	/**
	* gets 
	*
	* @returns String
	*/
	public String getSku()
	{
		return sku;
	}

	/**
	* sets 
	*
	*/
	public void setSku(String sku)
	{
		this.sku = sku;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getDescription()
	{
		return description;
	}

	/**
	* sets 
	*
	*/
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	* gets 
	*
	* @returns int
	*/
	public int getQuantity()
	{
		return quantity;
	}

	/**
	* sets 
	*
	*/
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getBaseUnitCode()
	{
		return baseUnitCode;
	}

	/**
	* sets 
	*
	*/
	public void setBaseUnitCode(String baseUnitCode)
	{
		this.baseUnitCode = baseUnitCode;
	}

	/**
	* gets 
	*
	* @returns int
	*/
	public int getStockManageFlag()
	{
		return stockManageFlag;
	}

	/**
	* sets 
	*
	*/
	public void setStockManageFlag(int stockManageFlag)
	{
		this.stockManageFlag = stockManageFlag;
	}

	/**
	* gets 
	*
	* @returns InventoryInnerSource
	*/
	public InventoryInnerSource getInnerSource()
	{
		return innerSource;
	}

	/**
	* sets 
	*
	*/
	public void setInnerSource(InventoryInnerSource innerSource)
	{
		this.innerSource = innerSource;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getOldMaterialNumber()
	{
		return oldMaterialNumber;
	}

	/**
	* sets 
	*
	*/
	public void setOldMaterialNumber(String oldMaterialNumber)
	{
		this.oldMaterialNumber = oldMaterialNumber;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExt1()
	{
		return ext1;
	}

	/**
	* sets 
	*
	*/
	public void setExt1(String ext1)
	{
		this.ext1 = ext1;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExt2()
	{
		return ext2;
	}

	/**
	* sets 
	*
	*/
	public void setExt2(String ext2)
	{
		this.ext2 = ext2;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExt3()
	{
		return ext3;
	}

	/**
	* sets 
	*
	*/
	public void setExt3(String ext3)
	{
		this.ext3 = ext3;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExt4()
	{
		return ext4;
	}

	/**
	* sets 
	*
	*/
	public void setExt4(String ext4)
	{
		this.ext4 = ext4;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getExt5()
	{
		return ext5;
	}

	/**
	* sets 
	*
	*/
	public void setExt5(String ext5)
	{
		this.ext5 = ext5;
	}

	/**
	* gets 
	*
	* @returns String
	*/
	public String getVendor()
	{
		return vendor;
	}

	/**
	* sets 
	*
	*/
	public void setVendor(String vendor)
	{
		this.vendor = vendor;
	}


	@Override
	public String toString()
	{
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}

	private static class Builder2 extends Builder<Builder2>
	{
		@Override
		protected Builder2 self()
		{
			return this;
		}
	}

	public static Builder<?> builder()
	{
		return new Builder2();
	}

	public abstract static class Builder<T extends Builder<T>> extends PropertyAwareEntityDto.Builder<T>
	{
		private String sku;
		private String description;
		private int quantity;
		private String baseUnitCode;
		private int stockManageFlag;
		private InventoryInnerSource innerSource;
		private String oldMaterialNumber;
		private String ext1;
		private String ext2;
		private String ext3;
		private String ext4;
		private String ext5;
		private String vendor;
		
	
		/**
		* sets 
		*
		*/
		public T setSku(String sku)
		{
			this.sku = sku;
			return self();
		}

		private String getSku()
		{
			return sku;
		}
	
		/**
		* sets 
		*
		*/
		public T setDescription(String description)
		{
			this.description = description;
			return self();
		}

		private String getDescription()
		{
			return description;
		}
	
		/**
		* sets 
		*
		*/
		public T setQuantity(int quantity)
		{
			this.quantity = quantity;
			return self();
		}

		private int getQuantity()
		{
			return quantity;
		}
	
		/**
		* sets 
		*
		*/
		public T setBaseUnitCode(String baseUnitCode)
		{
			this.baseUnitCode = baseUnitCode;
			return self();
		}

		private String getBaseUnitCode()
		{
			return baseUnitCode;
		}
	
		/**
		* sets 
		*
		*/
		public T setStockManageFlag(int stockManageFlag)
		{
			this.stockManageFlag = stockManageFlag;
			return self();
		}

		private int getStockManageFlag()
		{
			return stockManageFlag;
		}
	
		/**
		* sets 
		*
		*/
		public T setInnerSource(InventoryInnerSource innerSource)
		{
			this.innerSource = innerSource;
			return self();
		}

		private InventoryInnerSource getInnerSource()
		{
			return innerSource;
		}
	
		/**
		* sets 
		*
		*/
		public T setOldMaterialNumber(String oldMaterialNumber)
		{
			this.oldMaterialNumber = oldMaterialNumber;
			return self();
		}

		private String getOldMaterialNumber()
		{
			return oldMaterialNumber;
		}
	
		/**
		* sets 
		*
		*/
		public T setExt1(String ext1)
		{
			this.ext1 = ext1;
			return self();
		}

		private String getExt1()
		{
			return ext1;
		}
	
		/**
		* sets 
		*
		*/
		public T setExt2(String ext2)
		{
			this.ext2 = ext2;
			return self();
		}

		private String getExt2()
		{
			return ext2;
		}
	
		/**
		* sets 
		*
		*/
		public T setExt3(String ext3)
		{
			this.ext3 = ext3;
			return self();
		}

		private String getExt3()
		{
			return ext3;
		}
	
		/**
		* sets 
		*
		*/
		public T setExt4(String ext4)
		{
			this.ext4 = ext4;
			return self();
		}

		private String getExt4()
		{
			return ext4;
		}
	
		/**
		* sets 
		*
		*/
		public T setExt5(String ext5)
		{
			this.ext5 = ext5;
			return self();
		}

		private String getExt5()
		{
			return ext5;
		}
	
		/**
		* sets 
		*
		*/
		public T setVendor(String vendor)
		{
			this.vendor = vendor;
			return self();
		}

		private String getVendor()
		{
			return vendor;
		}
	
		protected abstract T self();

		public ItemInfo build(){
			return new ItemInfo(this);
		}
	}
}

